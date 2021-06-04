package com.example.trackndtraceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Admin extends AppCompatActivity {
    Button _btnadminpro, _btncovid, _btnhelp, _btnpatients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        _btnadminpro = (Button) findViewById(R.id.btnadminpro);
        _btncovid = (Button) findViewById(R.id.btncovid);
        _btnhelp = (Button) findViewById(R.id.btnhelp);
        _btnpatients = (Button) findViewById(R.id.btnpatients);
        _btnadminpro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this, adminprofile.class);
                startActivity(intent);
            }
        });
        _btncovid.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this, covid.class);
                startActivity(intent);
            }
        });
        _btnhelp.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this, helppage.class);
                startActivity(intent);
            }

        });
        _btnpatients.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this, Patients.class);
                startActivity(intent);
            }
        });
    }
}