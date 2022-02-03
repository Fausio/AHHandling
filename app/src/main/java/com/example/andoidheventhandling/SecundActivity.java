package com.example.andoidheventhandling;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecundActivity extends AppCompatActivity {

    private TextView mainTextView;
    private StringBuilder msg;

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.secund_activity);

        mainTextView = (TextView) findViewById(R.id.textView);

        Intent i  = getIntent();
        Bundle b = i.getExtras();

        msg = new StringBuilder("Welcome \n");

        if (b.containsKey(Consts.ConstName)){

            String name = b.getString(Consts.ConstName,"Name not found");
            msg.append(name);
        }

        if (b.containsKey(Consts.ConstAge)){

            int age = b.getInt(Consts.ConstAge,-1);
            msg.append("\n").append(age).append("year old");
        }

        mainTextView.setText(msg);
    }

}
