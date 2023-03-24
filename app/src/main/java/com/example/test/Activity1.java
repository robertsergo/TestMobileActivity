package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        t1=findViewById(R.id.textView);
        b1= findViewById(R.id.button);



    }

    public void gotoactivity2(View V){
        Toast.makeText(Activity1.this,"Hello dans 1",Toast.LENGTH_LONG).show();
        Intent i = new Intent(Activity1.this,Activity2.class);
        startActivity(i);

    }




}