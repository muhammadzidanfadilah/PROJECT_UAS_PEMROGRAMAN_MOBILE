package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class tab5 extends Fragment {
    View view;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_tab5, container, false);
        button = view.findViewById(R.id.playcreator);
        button.setOnClickListener(view -> playn());
        return view;
    }
    public void playn(){
        Intent intent = new Intent(requireContext(), aksi.class);
        startActivity(intent);
    }
}
