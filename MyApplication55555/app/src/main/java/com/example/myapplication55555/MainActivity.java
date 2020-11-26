package com.example.myapplication55555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    Button bt;
    Button btn;
    Button b;
    Button btns;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt =findViewById(R.id.btn1);
        btn = findViewById(R.id.btn2);
        b =  findViewById(R.id.call);
        tv = findViewById(R.id.showtxt);
        btns = findViewById(R.id.btnsend);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,statActivity.class);
                startActivityForResult(i, 3);
            }
        });


    }
    public void move(View v){
        Intent i = new Intent(MainActivity.this, secondActivity.class);
        i.putExtra("NAME" ,"Kamrangujjar");
        startActivity(i);
        finish();

    }
}