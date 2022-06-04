package com.example.medical_consutation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class createAccount extends AppCompatActivity {
TextView tv1,tv2;
EditText editText1,editText2,editText3,editText4;

Button btn1;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        tv1 =(TextView) findViewById(R.id.logo);
        tv2=(TextView) findViewById(R.id.caption);
        editText3=(EditText) findViewById(R.id.phone);
        editText4=(EditText) findViewById(R.id.username);
        editText1=(EditText) findViewById(R.id.mail);
        editText2=(EditText) findViewById(R.id.passwd);
        btn1=(Button) findViewById(R.id.signup);
        tv1.setText("Medic App");
        tv2.setText("your health your mate");
        //Initialize firebase auth
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser()!=null){
            finish();
            return;
        }
btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        registeruser();
    }
});
    }

    private void registeruser() {
        String usrname =editText4.getText().toString();
        String number=editText3.getText().toString();
        String email =editText1.getText().toString();
        String  password=editText2.getText().toString();

//        if (password.isEmpty() || password.length() < 6)
//        {
//            //editText2.setError("Password cannot be less than 6 characters!");
//            Toast.makeText(this,"Password cannot be less than 6 characters!",Toast.LENGTH_LONG).show();
//        }


         if (usrname.isEmpty()||number.isEmpty()||email.isEmpty() ){
            Toast.makeText(this,"please fill all fields",Toast.LENGTH_LONG).show();
        }
         else if (password.isEmpty()||password.length() < 6)
         {
             Toast.makeText(this,"Password cannot be less than 6 characters!",Toast.LENGTH_LONG).show();
         }
        }
    }


