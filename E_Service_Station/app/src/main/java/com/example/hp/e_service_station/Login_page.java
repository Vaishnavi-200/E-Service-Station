package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HP on 12-09-2022.
 */
public class Login_page extends AppCompatActivity {
     EditText e1,e2;
     TextView tv;
     SharedPrefHandler shr;
     Button btn;
     String mno,pass;
     String str_shr_mno,str_shr_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        e1=(EditText)findViewById(R.id.et_login);
        e2=(EditText)findViewById(R.id.et1_login);
        btn=(Button)findViewById(R.id.btn_login);
        tv=(TextView)findViewById(R.id.tv_new);
        shr=new SharedPrefHandler(this);
        str_shr_mno=shr.getSharedPreferences("moblie");
        str_shr_pass=shr.getSharedPreferences("password");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mno=e1.getText().toString();
                pass=e2.getText().toString();
                if (mno.length()<10 || pass.isEmpty()
                        ||!mno.matches("^[6-9]\\d{9}")
                        ){
                    Toast.makeText(Login_page.this, "Enter the details", Toast.LENGTH_SHORT).show();
                }
                else if(mno.equals(str_shr_mno) && pass.equals(str_shr_pass))
                         {
                             shr.setSharedPreferences("login","true");
                             shr.setSharedPreferences("umno",mno);
                             Intent i = new Intent(getApplication(),Home_page.class);
                             startActivity(i);
                             Toast.makeText(Login_page.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login_page.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),Signup_page.class);
                startActivity(i);
            }
        });
    }
}
