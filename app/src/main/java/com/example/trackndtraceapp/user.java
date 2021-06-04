package com.example.trackndtraceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user extends AppCompatActivity {
    Button _btnuserpro, _btnhelp, _btnloc, _btncovid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        _btnuserpro=(Button)findViewById(R.id.btnuserpro);
        _btncovid=(Button)findViewById(R.id.btncovid);
        _btnhelp=(Button) findViewById(R.id.btnhelp);
        _btnloc=(Button) findViewById(R.id.btnloc);
        _btnuserpro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                  Intent intent = new Intent(user.this, Userprofile.class);
                startActivity(intent);
            }
        });
        _btncovid.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user.this, covid.class);
                startActivity(intent);
            }
        });
        _btnhelp.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user.this, helppage.class);
                startActivity(intent);
            }

        });
        _btnloc.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}