package com.example.restaurantapp;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        ActionBarDrawerToggle toggle =  new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.settings_id) {

            Toast.makeText(getApplicationContext(), "Settings ready to open", Toast.LENGTH_SHORT).show();
        }

        else if
            (id==R.id.about_id) {

            Toast.makeText(getApplicationContext(), "About us page ready to open", Toast.LENGTH_SHORT).show();
        }

        else if (id==R.id.contact_id) {

            Toast.makeText(getApplicationContext(), "Contact us page ready to open", Toast.LENGTH_SHORT).show();
        }

        else if (id==R.id.search_id) {

            Toast.makeText(getApplicationContext(), "you are searching...", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.cart_id) {
            Toast.makeText(getApplicationContext(), "Welcome to the shopping", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
