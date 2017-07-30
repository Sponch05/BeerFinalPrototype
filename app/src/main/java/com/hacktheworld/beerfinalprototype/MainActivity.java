package com.hacktheworld.beerfinalprototype;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Response;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import static android.R.attr.path;
import static android.R.attr.theme;
import static android.view.View.X;
import static android.view.View.Y;

public class MainActivity extends AppCompatActivity {

    private PropertyValuesHolder pvhY;
    private PropertyValuesHolder pvhX;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //implement the ads
        MobileAds.initialize(this, "ca-app-pub-5568234313051912~9703537156");

        ImageButton loginLink = (ImageButton) findViewById(R.id.ingBtnLocation) ;


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Intent happy = new Intent(MainActivity.this, CongratulateActivity.class);
                startActivity(happy);
                Toast.makeText(getApplicationContext(), "Ad loaded sucsessfully, your credits have been loaded", Toast.LENGTH_LONG);
                Log.i("Ads", "onAdLoaded");
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                Toast.makeText(getApplicationContext(), "Could not connect check that the data is on", Toast.LENGTH_LONG);
                Log.i("Ads", "onAdFailedToLoad");
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                Toast.makeText(getApplicationContext(), "For openning the ad you get double points", Toast.LENGTH_LONG);
                Log.i("Ads", "onAdOpened");
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                Log.i("Ads", "onAdLeftApplication");
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
                Log.i("Ads", "onAdClosed");
            }
        });


        //Redirectig user to login page mm
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
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
