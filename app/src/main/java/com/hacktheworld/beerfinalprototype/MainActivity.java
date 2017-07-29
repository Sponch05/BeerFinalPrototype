package com.hacktheworld.beerfinalprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void consBtn (View view)
    {
        Intent consump = new Intent(this, Conumption.class);
        startActivity(consump);
    }

    public void drinkBtn (View view)
    {
        Intent drink = new Intent(this, DrinkNowCapture.class);
        startActivity(drink);
    }

    public void order_Btn (View view)
    {
        // implement order API
    }

    public void location_Btn (View view)
    {
        //Implement google maps API
    }



}
