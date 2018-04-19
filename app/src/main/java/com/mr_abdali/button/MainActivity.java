package com.mr_abdali.button;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // AppCompatButton
    AppCompatButton raisedButton;

    AppCompatButton flatButton;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // raised button
        raisedButton = (AppCompatButton) findViewById(R.id.raised_btn);
        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // your code here when button click
                Toast.makeText(getApplicationContext(), "Raised Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });


        // flat button
        flatButton = (AppCompatButton) findViewById(R.id.flat_btn);
        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //your code
                Toast.makeText(getApplicationContext(),"Flat button",Toast.LENGTH_SHORT).show();
            }
        });

        // fab button
        fab = (FloatingActionButton) findViewById(R.id.fab_btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // your code
                Toast.makeText(getApplicationContext(),"Floating Action Button....",Toast.LENGTH_LONG).show();
            }
        });

    }
}
