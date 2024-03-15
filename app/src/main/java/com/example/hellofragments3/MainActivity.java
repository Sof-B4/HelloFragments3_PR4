package com.example.hellofragments3;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public MainActivity() {
        super(R.layout.activity_main);
    }
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, Fragment_1.class, null)
                    .commit();
        }
    }
}