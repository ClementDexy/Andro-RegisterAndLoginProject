package com.example.restaurantapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button b1,b2;
    EditText et_email,et_password;
    TextView tv;
    int counter = 3;
    ProgressBar progressBar;
    private int progressStatus = 0;
    private TextView textView;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.btn_login);
        b2 = (Button) findViewById(R.id.cancel);
        et_email = (EditText) findViewById(R.id.email);
        et_password = (EditText) findViewById(R.id.password);
        tv = (TextView) findViewById(R.id.counter);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        textView = (TextView) findViewById(R.id.tv_progress);
        //tv.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_email.getText().toString().equals("dario")&&
                et_password.getText().toString().equals("admin")){


                    new Thread(new Runnable() {
                        public void run() {
                            while (progressStatus < 100) {
                                progressStatus += 1;
                                // Update the progress bar and display the
                                //current value in the text view
                                handler.post(new Runnable() {
                                    public void run() {
                                        progressBar.setProgress(progressStatus);
                                        textView.setText(progressStatus+"/"+progressBar.getMax());


                                        if (progressStatus == 100){

                                            Toast.makeText(Login.this,"Redirecting...",Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(".MainActivity");
                                            startActivity(intent);

                                        }
                                    }
                                });
                                try {
                                    // Sleep for 200 milliseconds.
                                    Thread.sleep(200);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }


                            }
                        }
                    }).start();

                                    }
                else{
                    Toast.makeText(Login.this,"Incorrect Username or Password",Toast.LENGTH_SHORT).show();
                    tv.setVisibility(View.VISIBLE);
                    tv.setBackgroundColor(Color.RED);
                    counter--;
                    tv.setText(Integer.toString(counter));

                    if (counter == 0){
                        b1.setEnabled(false);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(".Registration");
                startActivity(intent);
            }
        });
    }
}
