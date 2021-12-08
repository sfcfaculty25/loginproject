package com.firstandroid.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText myemail,mypass;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     myemail=findViewById(R.id.email);
        mypass=findViewById(R.id.pass);
        btnlogin=findViewById(R.id.btn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 String a=myemail.getText().toString();
 String b=mypass.getText().toString();
 if(a.equals("Basheer") && b.equals("123")){
     Intent i=new Intent(MainActivity.this,MainActivity2.class);
     i.putExtra("myname",a);
     i.putExtra("mypass",b);
     startActivity(i);
 }
 else {
     Toast.makeText(MainActivity.this,"Invalid Email and Pass",Toast.LENGTH_LONG).show();
 }
            }
        });

    }
}