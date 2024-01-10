package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AktivitasHallo extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivitas_hallo);

        button = (Button) findViewById(R.id.btn_back);
        button.setOnClickListener(view -> kembali());
    }
    public void kembali() {
        Intent intent = new Intent(this, AktivitasUI.class);
        startActivity(intent);
    }
}