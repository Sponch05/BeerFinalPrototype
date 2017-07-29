package com.hacktheworld.beerfinalprototype;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.path;
import static android.view.View.X;
import static android.view.View.Y;

public class MainActivity extends AppCompatActivity {

    private PropertyValuesHolder pvhY;
    private PropertyValuesHolder pvhX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void consBtn (View view) {
        Intent consump = new Intent(this, Consumption.class);
        startActivity(consump);
        PropertyValuesHolder tranX = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, path);
        PropertyValuesHolder tranY = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, path);
        Object scaleButton;

        //Instantiating the variables
        String sb ="scaleButton";
        String px ="pvhX";
        String py ="pvhY";

        ObjectAnimator scaleAnimation;
        scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(sb, pvhX, pvhY);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(ValueAnimator.REVERSE);
    }


    public void drinkBtn (View view)
    {
        Intent drink = new Intent(this, DrinkNowCapture.class);
        startActivity(drink);

        Intent drinkBtn  = new Intent(this, Consumption.class);
        startActivity(drinkBtn);
        PropertyValuesHolder tranX = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, path);
        PropertyValuesHolder tranY = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, path);
        Object scaleButton;

        //Instantiating the variables
        String sb ="scaleButton";
        String px ="pvhX";
        String py ="pvhY";

        ObjectAnimator scaleAnimation;
        scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(sb, pvhX, pvhY);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(ValueAnimator.REVERSE);
    }

    public void order_Btn (View view)
    {
        // implement order API
        Intent order_Btn = new Intent(this, DrinkNowCapture.class);
        startActivity(order_Btn);

        Intent drinkBtn  = new Intent(this, Consumption.class);
        startActivity(drinkBtn);
        PropertyValuesHolder tranX = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, path);
        PropertyValuesHolder tranY = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, path);
        Object scaleButton;

        //Instantiating the variables
        String sb ="scaleButton";
        String px ="pvhX";
        String py ="pvhY";

        ObjectAnimator scaleAnimation;
        scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(sb, pvhX, pvhY);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(ValueAnimator.REVERSE);
    }

    public void location_Btn (View view)
    {
        //Implement google maps API
        Intent location_Btn = new Intent(this, DrinkNowCapture.class);
        startActivity(location_Btn);

        Intent drinkBtn  = new Intent(this, Consumption.class);
        startActivity(location_Btn);
        PropertyValuesHolder tranX = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, path);
        PropertyValuesHolder tranY = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, path);
        Object scaleButton;

        //Instantiating the variables
        String sb ="scaleButton";
        String px ="pvhX";
        String py ="pvhY";

        ObjectAnimator scaleAnimation;
        scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(sb, pvhX, pvhY);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(ValueAnimator.REVERSE);
    }



}
