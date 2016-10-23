package com.example.user.ibmcalculator;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a1 = (Button) findViewById(R.id.button_Calculate);
        EditText hText = (EditText) findViewById(R.id.edit_Text_Height) ;
        EditText wText = (EditText) findViewById(R.id.edit_Text_Weight) ;
        a1.setOnClickListener(this);





    }
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, Main2Activity.class);


            startActivity(i);
        }
}
