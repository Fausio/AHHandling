package com.example.andoidheventhandling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {


    private EditText txtForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // link the active with this java file

        txtForm =(EditText) findViewById(R.id.editTextTextPersonName2);
    }


    public void SumitInfo(View view) {

        Intent intent = new Intent(this,SecundActivity.class);
        startActivity(intent);
    }
}