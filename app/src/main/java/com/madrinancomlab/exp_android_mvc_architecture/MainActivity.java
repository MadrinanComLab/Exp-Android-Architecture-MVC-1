package com.madrinancomlab.exp_android_mvc_architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer, View.OnClickListener
{
    // SOURCE OF THIS EXPERIMENT: https://www.geeksforgeeks.org/mvc-model-view-controller-architecture-pattern-in-android-with-example/?ref=lbp

    // CREATING OBJECT OF MODEL CLASS
    private Model model;

    // CREATING OBJECT OF BUTTON CLASS
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CREATING RELATIONSHIP BETWEEN THE OBSERVABLE MODEL AND THE OBSERVER ACTIVITY
        model = new Model();
        model.addObserver(this);

        // ASSIGNING BUTTON IDs TO THE OBJECTS
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        // TRANSFER THE CONTROL TO THE OnClick() METHOD WHEN A BUTTON IS CLICKED BY PASSING ARGUMENT 'this'
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    // CALLING setValueAtIndex() METHOD BY PASSING APPROPRIATE ARGUMENTS FOR DIFFERENT BUTTONS
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button:
                model.setValueAtIndex(0);
                break;

            case R.id.button2:
                model.setValueAtIndex(1);
                break;

            case R.id.button3:
                model.setValueAtIndex(2);
                break;
        }
    }

    // FUNCTION TO UPDATE THE VIEW AFTER THE VALUES ARE MODIFIED BY THE MODEL
    @Override
    public void update(Observable observable, Object o)
    {
        // CHANGING TEXT OF THE BUTTONS ACCORDING TO UPDATED VALUES
        button1.setText("Count: " + model.getValueAtIndex(0));
        button2.setText("Count: " + model.getValueAtIndex(1));
        button3.setText("Count: " + model.getValueAtIndex(2));
    }
}