package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutVertical extends AppCompatActivity {
     Button button3;
     Button button4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_vertical);
        button3=(Button)findViewById(R.id.Button1);
        button4=(Button)findViewById(R.id.Button2);
    }

    public void gotobutton1(View view) {
        Intent i2=new Intent(this, MainActivity.class);
        startActivity(i2);
    }

    public void gotobutton2(View view) {
        Intent i3=new Intent(this, MainActivity.class);
        startActivity(i3);
    }
}
