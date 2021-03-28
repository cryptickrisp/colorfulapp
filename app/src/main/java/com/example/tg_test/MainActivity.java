package com.example.tg_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //       String textbox = getText(findViewById(R.id.textbox));
 //       String textbox2 = getText(findViewById(R.id.textbox2));
 //       textbox2 = "あいうえお" + textbox

         String textbox = (String) getText(findViewById(R.id.textbox));
         String textbox2 = (String) getText(findViewById(R.id.textbox2));
         textbox2 = "あいうえお" + textbox2;


    }
}