package com.hacktheworld.beerfinalprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void startBtn(View view)
    {
        Intent startpage = new Intent(this, landingActivity.class);
        startActivity(startpage);
    }

    public void aboutBtn(View view)
    {
        Intent aboutPage = new Intent (this, AboutActivity.class);
        startActivity(aboutPage);
    }

}
