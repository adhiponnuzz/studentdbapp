package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
     EditText ed1,ed2,ed3,ed4;
     AppCompatButton b1,b2;
     String getadm,getname,getroll,getclg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ed1=(EditText) findViewById(R.id.adm);
        ed2=(EditText) findViewById(R.id.name);
        ed3=(EditText) findViewById(R.id.roll);
        ed4=(EditText) findViewById(R.id.clg);
        b1=(AppCompatButton) findViewById(R.id.srh);
        b2=(AppCompatButton) findViewById(R.id.btm);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getadm=ed1.getText().toString();
                getname=ed2.getText().toString();
                getroll=ed3.getText().toString();
                getclg=ed4.getText().toString();

                Toast.makeText(getApplicationContext(),getadm, Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}