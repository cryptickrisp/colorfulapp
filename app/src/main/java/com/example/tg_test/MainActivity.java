package com.example.tg_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //       String textbox = getText(findViewById(R.id.textbox));
 //       String textbox2 = getText(findViewById(R.id.textbox2));
 //       textbox2 = "あいうえお" + textbox

        TextView x = (TextView)findViewById(R.id.textbox);
        String xStr = String.valueOf(x.getText());
        x.setText(xStr + "  - hello world again! - " + xStr);

        /*
         String textbox = (String) getText();
         String textbox2 = (String) getText();
         */
         //textbox2 = "あいうえお" + textbox2;


    }
}