package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HP on 14-09-2022.
 */
public class Profile_page extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button btn1;
    SharedPrefHandler shr;
    String firstname,lastname,mno,email,city,postal,pass;
    String[] product;
    List<UserAccount_Array> productList;
    String str_shr_umno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);
        shr=new SharedPrefHandler(this);
        str_shr_umno = shr.getSharedPreferences("umno");

        Toast.makeText(Profile_page.this, ""+str_shr_umno, Toast.LENGTH_SHORT).show();
        getProductByCode(str_shr_umno);
        e1=(EditText)findViewById(R.id.et_first);
        e2=(EditText)findViewById(R.id.et1_last);
        e3=(EditText)findViewById(R.id.et2_mno);
        e4=(EditText)findViewById(R.id.et3_email);
        e5=(EditText)findViewById(R.id.et4_city);
        e6=(EditText)findViewById(R.id.et5_address);
        e7=(EditText)findViewById(R.id.et6_pass);
        btn1=(Button)findViewById(R.id.btn_update);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstname = e1.getText().toString();
                lastname = e2.getText().toString();
                mno = e3.getText().toString();
                email = e4.getText().toString();
                city = e5.getText().toString();
                postal = e6.getText().toString();
                pass = e7.getText().toString();
                if (firstname.isEmpty() || lastname.isEmpty() || mno.isEmpty() || email.isEmpty() || city.isEmpty() || postal.isEmpty() || pass.isEmpty()

                        || !firstname.matches("[a-zA-Z]+")
                        || !lastname.matches("[a-zA-Z]+")
                        || !mno.matches("^[6-9]\\d{9}")
                        || !email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
                        || !city.matches("[a-zA-Z]+")

                        ) {
                    Toast.makeText(Profile_page.this, "Enter details", Toast.LENGTH_SHORT).show();
                } else {
                    CreateUserAccount();
                    Toast.makeText(Profile_page.this, "updated successfully " + firstname + lastname + mno + email + postal + pass, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void getProductByCode(final String str_shr_umno)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<UserAccount_Array>> call = api.getUserDetails(str_shr_umno);

        call.enqueue(new Callback<List<UserAccount_Array>>() {
            @Override
            public void onResponse(Call<List<UserAccount_Array>> call, Response<List<UserAccount_Array>> response) {
                productList = response.body();

                Boolean isSuccess = false;
                if (response.body() != null) {
                    isSuccess = true;
                }

                if (isSuccess) {
                    e1.setText(productList.get(0).getFirstname());
                    e2.setText( productList.get(0).getLastname());
                    e3.setText( productList.get(0).getMno());
                    e4.setText( productList.get(0).getEmail());
                    e5.setText( productList.get(0).getCity());
                    e6.setText(productList.get(0).getAddress());
                    e7.setText( productList.get(0).getPassword());

                    //finish();

                } else {

                }
            }

            @Override
            public void onFailure(Call<List<UserAccount_Array>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CreateUserAccount() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<IsExist> call = api.updatepage(
                firstname,lastname,mno,email,city,postal,pass
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
