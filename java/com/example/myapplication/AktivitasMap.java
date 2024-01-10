package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class AktivitasMap extends AppCompatActivity {

    private MaterialButton BtnPinLocation;

    private String latitudeOne = "-6.238270";
    private String longtitudeOne = "106.975571";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivitas_map);

        setClick();

    }


    void setClick(){
        BtnPinLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BtnPinLocation(latitudeOne, longtitudeOne);
            }
        });
    }

    private void BtnPinLocation(String latitude, String longtitude) {
        Uri mapUri = Uri.parse("https://maps.google.com/maps/search/" + latitude + "," + longtitude);
        Intent intent = new Intent(Intent.ACTION_VIEW, mapUri);
        startActivity(intent);
    }
}