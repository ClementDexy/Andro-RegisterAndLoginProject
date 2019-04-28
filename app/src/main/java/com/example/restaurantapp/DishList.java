package com.example.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DishList extends AppCompatActivity {


     RecyclerView mRecyclerView;
     RecyclerView.Adapter mAdapter;
     RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_list);
        ArrayList<DishItems> exampleList = new ArrayList<>();

        exampleList.add(new DishItems(R.drawable.food,"Chinese Special","150$"));
        exampleList.add(new DishItems(R.drawable.food1,"Line3","Line4"));
        exampleList.add(new DishItems(R.drawable.food2,"Line5","Line6"));
        exampleList.add(new DishItems(R.drawable.food3,"Line1","Line2"));
        exampleList.add(new DishItems(R.drawable.food4,"Line3","Line4"));

        exampleList.add(new DishItems(R.drawable.food,"Chinese Special","150$"));
        exampleList.add(new DishItems(R.drawable.food1,"Line3","Line4"));
        exampleList.add(new DishItems(R.drawable.food2,"Line5","Line6"));
        exampleList.add(new DishItems(R.drawable.food3,"Line1","Line2"));
        exampleList.add(new DishItems(R.drawable.food4,"Line3","Line4"));
        exampleList.add(new DishItems(R.drawable.food,"Chinese Special","150$"));
        exampleList.add(new DishItems(R.drawable.food1,"Line3","Line4"));
        exampleList.add(new DishItems(R.drawable.food2,"Line5","Line6"));
        exampleList.add(new DishItems(R.drawable.food3,"Line1","Line2"));
        exampleList.add(new DishItems(R.drawable.food4,"Line3","Line4"));





        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
