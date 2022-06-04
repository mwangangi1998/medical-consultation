package com.example.medical_consutation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class createAccount extends AppCompatActivity {
TextView tv1,tv2;
EditText editText1,editText2;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        tv1 =(TextView) findViewById(R.id.logo);
        tv2=(TextView) findViewById(R.id.caption);
        editText1=(EditText) findViewById(R.id.mail);
        editText2=(EditText) findViewById(R.id.passwd);
        btn1=(Button) findViewById(R.id.signup);
        tv1.setText("Medic App");
        tv2.setText("your health your mate");
        editText1.setText(" Email");
        editText2.setText("password");

    }
}