package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HP on 12-09-2022.
 */
public class Signup_page extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button btn1;
    SharedPrefHandler shr;
    String firstname,lastname,mno,email,city,postal,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);
        shr=new SharedPrefHandler(this);
        e1=(EditText)findViewById(R.id.et_signup);
        e2=(EditText)findViewById(R.id.et1_signup);
        e3=(EditText)findViewById(R.id.et2_signup);
        e4=(EditText)findViewById(R.id.et3_signup);
        e5=(EditText)findViewById(R.id.et4_signup);
        e6=(EditText)findViewById(R.id.et5_signup);
        e7=(EditText)findViewById(R.id.et6_signup);
        btn1=(Button)findViewById(R.id.btn_signup);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstname=e1.getText().toString();
                lastname=e2.getText().toString();
                mno=e3.getText().toString();
                email=e4.getText().toString();
                city=e5.getText().toString();
                postal=e6.getText().toString();
                pass=e7.getText().toString();
                if ( firstname.isEmpty() || lastname.isEmpty() || mno.isEmpty() || email.isEmpty() || city.isEmpty() || postal.isEmpty() || pass.isEmpty()

                        ||!firstname.matches("[a-zA-Z]+")
                        ||!lastname.matches("[a-zA-Z]+")
                        ||!mno.matches("^[6-9]\\d{9}")
                        ||!email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
                        ||!city.matches("[a-zA-Z]+")

                        )
                {
                    Toast.makeText(Signup_page.this, "Enter details", Toast.LENGTH_SHORT).show();
                }
                else {
                    shr.setSharedPreferences("moblie",mno);
                    shr.setSharedPreferences("password",pass);


                    Intent i = new Intent(getApplication(),Login_page.class);
                    startActivity(i);
                    CreateUserAccount();
                    Toast.makeText(Signup_page.this, "signup successfully ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    //This function is used to post application data to the server using post method and help of retrofit library(HTTP protocol)
    private void CreateUserAccount() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<IsExist> call = api.Signup_page(
                firstname,
                lastname,
                mno,
                email,
                city,
                postal,
                pass
        );

        call.enqueue(new Callback<IsExist>() {
            @Override
            public void onResponse(Call<IsExist> call, Response<IsExist> response) {
                IsExist responseResult = response.body();

                Boolean isSuccess = false;
                if (responseResult != null) {
                    isSuccess = responseResult.getSuccess();
                }

                if (isSuccess) {

                } else {
                    // Show Creation Failed Message

                }
            }

            @Override
            public void onFailure(Call<IsExist> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
