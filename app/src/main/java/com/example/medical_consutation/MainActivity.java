package com.example.medical_consutation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Medicalconsutation);
        setContentView(R.layout.activity_main);
        btn1 =(Button) findViewById(R.id.createaccount);
        btn2 =(Button) findViewById(R.id.signin);
        tv1 =(TextView) findViewById(R.id.caption);
        tv2=(TextView) findViewById(R.id.logo);
        tv1.setText("Your health your mate");
        tv2.setText("Medic APP");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivities();


            }
        });

    }

    private void openActivity2() {
        Intent signin =new Intent(this,signIn.class);
        startActivity(signin);
    }

    private void openActivities() {
        Intent intent =new Intent(this,createAccount.class);
        startActivity(intent);
    }


}