package com.firstandroid.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
TextView tv1,tv2;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.tvname);
        tv2=findViewById(R.id.tvpass);
    Intent obj=getIntent();
    String n=obj.getStringExtra("myname");
    String m=obj.getStringExtra("mypass");
tv1.setText(n);
tv2.setText(m);
    }
}