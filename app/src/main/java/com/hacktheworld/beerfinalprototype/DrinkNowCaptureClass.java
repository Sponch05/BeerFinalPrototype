package com.hacktheworld.beerfinalprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class DrinkNowCaptureClass extends AppCompatActivity {



    //My variables
    //BacckEnd Variables
    float glassSize = 0;
    float contSize = 0;
    float alacVol = 0;
    float units = 0;
    float bloodContent = 0;
    int drinkCount = 0;

    //VAribles for Android
    private static SeekBar glassSizeSeek;
    private static SeekBar beerAlcVolSeek;
    private static TextView percentTxt;
    private static TextView numDrinksTxt;
    private static TextView glassSizeTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_now_capture_class);
    }

    public  void glassSizebar () {

        glassSizeSeek = (SeekBar) glassSizeSeek.findViewById(R.id.glassSizeSeekUI);
        glassSizeTxt = (TextView) glassSizeSeek.findViewById(R.id.glassSizeTxt);
        glassSizeTxt.setText("Glass Size : " + glassSizeSeek.getProgress());

        glassSizeSeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                        percentTxt.setText("Glass Size : " + glassSizeSeek.getProgress());
                        Toast.makeText(getActivity(), "This text should vary according to selection", Toast.LENGTH_SHORT).show();
                    }

                    public void onStartTrackingTouch(SeekBar seekbar) {

                        Toast.makeText(getActivity(), "You are now making changes implement funny commantary", Toast.LENGTH_SHORT).show();

                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {

                        percentTxt.setText("Glass Size : " + glassSizeSeek.getProgress());
                        Toast.makeText(getActivity(), "This text should vary according to selection", Toast.LENGTH_SHORT).show();

                    }

                }
        );
    }

    public void volEntryBar()
    {
        beerAlcVolSeek  = (SeekBar) beerAlcVolSeek.findViewById(R.id.beerVolSeekUI);
        percentTxt = (TextView) percentTxt.findViewById(R.id.beerVolTxt);
        percentTxt.setText("Beer Volume/Percentage : " + beerAlcVolSeek.getProgress()  );

        beerAlcVolSeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener()
                {
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {

                        percentTxt.setText("Beer Volume/Percentage : " + beerAlcVolSeek.getProgress()  );
                        Toast.makeText(getActionBar(), "This text should vary according to selection", Toast.LENGTH_SHORT).show();
                    }

                    public void onStartTrackingTouch(SeekBar seekbar) {

                        percentTxt.setText("Beer Volume/Percentage : " + beerAlcVolSeek.getProgress()  );

                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {

                        percentTxt.setText("Beer Volume/Percentage : " + beerAlcVolSeek.getProgress()  );
                        Toast.makeText(getActivity(), "This text should vary according to selection", Toast.LENGTH_SHORT).show();
                    }
                }
        );


    }

    public void drinkNow(View view)
    {
        numDrinksTxt = (TextView) numDrinksTxt.findViewById(R.id.drinkCountTxtV);
        numDrinksTxt.setText("Drinks had so far : " + drinkCount);
        glassSize = glassSizeSeek.getProgress();
        alacVol = beerAlcVolSeek.getProgress();
        drinkCount++;


    }

}
