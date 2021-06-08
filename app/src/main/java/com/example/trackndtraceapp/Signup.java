package com.example.trackndtraceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public abstract class Signup extends AppCompatActivity {

    EditText uname, upass, address;
    Button btnsignup;
    public abstract void DBhelper();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

uname = (EditText)findViewById(R.id.uname);
upass =  (EditText)findViewById(R.id.upass);
address = (EditText)findViewById(R.id.address);
btnsignup = (Button)findViewById(R.id.btnsignup);
    myDB = new DBhelper(this);



btnsignup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String user = uname.getText().toString();
        String password = upass.getText().toString();

        if(user.equals("") || password.equals("")) {
            (
                    Toast.makeText(Signup.this, "fill in all the fields", Toast.LENGTH_SHORT).show();
        }


        }




});

    }
}