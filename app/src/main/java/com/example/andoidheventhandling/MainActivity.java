package com.example.andoidheventhandling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // link the active with this java file


        layout = findViewById(R.id.MyConstraintLayout);

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);

    }
}