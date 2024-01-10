package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AktivitasFibonacci extends AppCompatActivity {
    public int count = 0;
    public int countFibo = 0;
    public TextView showCount;
    public TextView showCountFibo;
    public Button buttonToast;
    public Button buttonCount;
    public Button buttonReset;
    public Toast toastA;

    private EditText edit_max_fibonacci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivitas_fibonacci);
        buttonToast=(Button)findViewById(R.id.button_toast);
        buttonCount=(Button)findViewById(R.id.buttonCount);
        buttonReset=(Button)findViewById(R.id.buttonReset);
        showCount=(TextView)findViewById(R.id.textCount);
        showCountFibo=(TextView)findViewById(R.id.textCountFibo);


        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toastA != null) { toastA.cancel(); }
                toastA = Toast.makeText(getApplicationContext(), "Angka Fibonancci",
                        Toast.LENGTH_SHORT);
                toastA.show();
            }
        });

        buttonCount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { calculate(view);}
        });
        buttonReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { reset(view);}
        });

    }

    protected void calculate(View view){
        count++;
        countFibo = calculateFibo(count);
        showCount.setText("Tombol Hitung Diklik Sebanyak :" + Integer.toString(count));
        showCountFibo.setText(Integer.toString(countFibo));
        if (count % 4 == 0) {
            showCount.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (count % 4 == 1) {
            showCount.setTextColor(getResources().getColor(R.color.colorAccent));
        } else if (count % 4 == 2) {
            showCount.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else {
            showCount.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        if(count % 5 ==0) {

            if (count % 4 == 0) {
                showCount.setTextColor(getResources().getColor(R.color.colorPrimary));
            } else if (count % 4 == 1) {
                showCount.setTextColor(getResources().getColor(R.color.colorAccent));
            } else if (count % 4 == 2) {
                showCount.setTextColor(getResources().getColor(R.color.colorPrimary));
            } else {
                showCount.setTextColor(getResources().getColor(R.color.colorAccent));
            }
            if(toastA != null) toastA.cancel();
            toastA = Toast.makeText(getApplicationContext(), "Tombol Hitung Diklik Sebanyak",
                    Toast.LENGTH_LONG);
            toastA.show();
        }

        if (count % 4 == 0) {
            showCount.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (count % 4 == 1) {
            showCount.setTextColor(getResources().getColor(R.color.colorAccent));
        } else if (count % 4 == 2) {
            showCount.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else {
            showCount.setTextColor(getResources().getColor(R.color.colorAccent));
        }
    }
    protected int calculateFibo(int n){
        if(n <= 1) return n;
        int prev,current,next;
        prev = 0;
        current = 1;
        for (int i = 2; i <= n; i++){
            next = prev + current;
            prev = current;
            current = next;
        }
        return current;

    }


    protected void reset(View view) {
        count = 0;
        countFibo = 0;
        showCount.setText("Tombol Hitung Diklik Sebanyak : " + Integer.toString(count));
        showCountFibo.setText(Integer.toString(count));

    }
}