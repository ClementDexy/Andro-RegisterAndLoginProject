package com.example.restaurantapp;

public class DishItems {
    private int mImageResoure;
    private String mText1;
    private String mText2;

    public DishItems(int imageResource, String text1, String text2){
        mImageResoure = imageResource;
        mText1 = text1;
        mText2 = text2;
    }

    public  int getImageResource(){

        return mImageResoure;
    }

    public String getText1(){
        return mText1;
    }

    public String getText2(){
        return mText2;
    }
}

