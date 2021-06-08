package com.example.trackndtraceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText _txtUser, _txtPass;
    Button _btnLogin, _btnsign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _txtPass = (EditText) findViewById(R.id.txtPass);
        _txtUser = (EditText) findViewById(R.id.txtUser);
        _btnLogin = (Button) findViewById(R.id.btnLogin);
        _btnsign = (Button) findViewById(R.id.btnsign);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.userType, R.layout.support_simple_spinner_dropdown_item);
        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_txtUser.getText().toString().equals("admin") && _txtPass.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, Admin.class);
                    startActivity(intent);


                } else if (_txtUser.getText().toString().equals("user") && _txtPass.getText().toString().equals("user")) {
                    Intent intent = new Intent(MainActivity.this, user.class);
                    startActivity(intent);


                } else {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();

                }


            }


        });

        _btnsign.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, covid.class);
                startActivity(intent);
            }


        });

    }
}