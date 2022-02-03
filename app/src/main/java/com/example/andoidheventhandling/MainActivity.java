package com.example.andoidheventhandling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static String TAG = ConstraintLayout.class.getSimpleName();
    private ConstraintLayout layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // link the active with this java file


        layout = findViewById(R.id.MyConstraintLayout);

        Button btn1 = findViewById(R.id.button1); // Download
        Button btn2 = findViewById(R.id.button2); // Send Mssage

        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button1:
                layout.setBackgroundColor(Color.DKGRAY);
                Log.i(TAG, "btn Clicked 1");
                break;

            case R.id.button2:
                layout.setBackgroundColor(Color.MAGENTA);
                Log.i(TAG, "btn Clicked 2");
                break;
        }

    }
}