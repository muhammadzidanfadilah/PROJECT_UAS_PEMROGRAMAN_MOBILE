package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class tab4 extends Fragment {

    View view;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_tab4, container, false);
        button = view.findViewById(R.id.playcatbob);
        button.setOnClickListener(view -> playn());
        return view;
    }
    public void playn(){
        Intent intent = new Intent(requireContext(), sahabat.class);
        startActivity(intent);
    }
}