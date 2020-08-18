package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
//   SharedPreferences s;
   EditText t1,t2;
   Button b1,b2;
   TextView t3,t4;
   CheckBox checkBox;
   MySharedPref mySharedPref;
//    SharedPreferences.Editor et ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.Email);
        t2=findViewById(R.id.Password);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        t3=findViewById(R.id.textView);
        t4=findViewById(R.id.textView2);
        checkBox=findViewById(R.id.checkBox);
        mySharedPref=new MySharedPref(MainActivity.this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySharedPref.setEmail(t1.getText().toString());
                Toast.makeText(getApplicationContext(),""+mySharedPref.getEmail(),Toast.LENGTH_LONG).show();
                t3.setText(mySharedPref.getEmail());
            }
        });

//
//        s=getSharedPreferences("user",MODE_PRIVATE);
//        et = s.edit();
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name=t1.getText().toString();
//                String password=t2.getText().toString();
//                et.putString("username",name);
//                et.putString("password",password);
//                et.apply();
//                Intent i = new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(i);
//                finish();
//
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                t3.setText(s.getString("username","user"));
//                t4.setText(s.getString("password","password"));
//            }
//        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox.isChecked()){
                    mySharedPref.setStatus("true");
                }
                else
                {
                    mySharedPref.setStatus("false");
                }
            }
        });
//        if(Objects.equals(s.getString("check-box", "status"), "true"))
//        {
//             t1.setText(s.getString("username","u"));
//            t2.setText(s.getString("password","p"));
//
//
//        }
//        else
//        {
//            t1.setText(" ");
//            t2.setText(" ");
//        }

    }
}