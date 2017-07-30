package com.hacktheworld.beerfinalprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import com.android.volley.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton loginLink = (ImageButton) findViewById(R.id.ingBtnLocation) ;

        //Redirectig user to login page mm
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }




    public void consBtn (View view)
    {
        Intent consump = new Intent(this, Consumption.class);
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
