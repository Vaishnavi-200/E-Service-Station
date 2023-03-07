package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HP on 15-09-2022.
 */
public class Vehicle_service_station_details extends AppCompatActivity {
    SharedPrefHandler sharedPrefHandler;
    String string;
    Button btn;

    String[] products;
    List<ServiceArray> productList;
    ArrayAdapter<String> adapter;

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_service_station_details);

        sharedPrefHandler = new SharedPrefHandler(this);


        string = sharedPrefHandler.getSharedPreferences("station");

        getProductByCode(string);


        textView1 = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        textView3 = (TextView) findViewById(R.id.tv3);
        textView4 = (TextView) findViewById(R.id.tv4);
        textView5 = (TextView) findViewById(R.id.tv5);
        textView6 = (TextView) findViewById(R.id.tv6);
        textView7 = (TextView) findViewById(R.id.tv7);
        btn       =  (Button) findViewById(R.id.btn_get);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),Direction_vss_page.class);
                startActivity(i);
            }
        });


    }

    private void getProductByCode(final String string) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<ServiceArray>> call = api.getServiceDetails(string);

        call.enqueue(new Callback<List<ServiceArray>>() {
            @Override
            public void onResponse(Call<List<ServiceArray>>call, Response<List<ServiceArray>> response) {
                productList = response.body();

                Boolean isSuccess = false;
                if (response.body() != null) {
                    isSuccess = true;
                }

                if (isSuccess) {
                    textView1.setText("stationid: "+productList.get(0).getstationid());
                    textView2.setText("stationname: "+productList.get(0).getStationname());
                    textView3.setText("city: "+productList.get(0).getCity());
                    textView4.setText("address: "+productList.get(0).getAddress());
                    textView5.setText("mno: "+productList.get(0).getMno());
                    textView6.setText("portdetails: "+productList.get(0).getPortdetails());
                    textView7.setText("servicecharge: "+productList.get(0).getServicecharge());

                    //finish();

                } else {

                }
            }

            @Override
            public void onFailure(Call<List<ServiceArray>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}

