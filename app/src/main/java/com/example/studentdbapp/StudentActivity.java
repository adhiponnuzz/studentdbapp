package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getname,getroll,getadm,getclg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.roll);
        ed3=(EditText) findViewById(R.id.adm);
        ed4=(EditText) findViewById(R.id.clg);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.btm);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getroll=ed2.getText().toString();
                getadm=ed3.getText().toString();
                getclg=ed4.getText().toString();

                Toast.makeText(getApplicationContext(),getname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getroll, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getadm,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getclg,Toast.LENGTH_SHORT).show();
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