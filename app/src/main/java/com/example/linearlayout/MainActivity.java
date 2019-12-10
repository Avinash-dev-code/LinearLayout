package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.Button1);
        button2=(Button)findViewById(R.id.Button2);



    }

    public void gotobutton3(View view) {
        Intent i1=new Intent(this, LinearLayoutVertical.class );
        startActivity(i1);
    }

    public void gotobutton4(View view) {
        Intent i2=new Intent(this, LinearLayoutVertical.class );
        startActivity(i2);
    }
}

