package com.madrinancomlab.exp_android_mvc_architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    // SOURCE OF THIS EXPERIMENT: https://www.geeksforgeeks.org/mvc-model-view-controller-architecture-pattern-in-android-with-example/?ref=lbp

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}