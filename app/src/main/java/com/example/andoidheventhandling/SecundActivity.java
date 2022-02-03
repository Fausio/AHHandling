package com.example.andoidheventhandling;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecundActivity extends AppCompatActivity {

    private TextView mainTextView;

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.secund_activity);

        mainTextView = (TextView) findViewById(R.id.textView);
    }

}
