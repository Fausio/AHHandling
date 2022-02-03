package com.example.andoidheventhandling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {


    private static String TAG = ConstraintLayout.class.getSimpleName();
    private ConstraintLayout layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // link the active with this java file

        layout = findViewById(R.id.MyConstraintLayout);

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                layout.setBackgroundColor(Color.DKGRAY);
                Log.i(TAG, "btn Clicked 1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                layout.setBackgroundColor(Color.RED);
                Log.i(TAG, "btn Clicked 1");
            }
        });


    }

}