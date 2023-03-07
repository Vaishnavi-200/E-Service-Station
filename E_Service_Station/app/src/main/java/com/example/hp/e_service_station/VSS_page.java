package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
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
public class VSS_page extends AppCompatActivity {
    Spinner city;
    String str_city;
    Button search;
    ListView list;

    String[] products;
    List<ServiceArray> productList;
    ArrayAdapter<String> adapter;
    SharedPrefHandler sharedPrefHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vss_page);
        sharedPrefHandler=new SharedPrefHandler(this);

        city=(Spinner)findViewById(R.id.vss);
        list=(ListView)findViewById(R.id.lv);
        search=(Button)findViewById(R.id.btn_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_city = city.getSelectedItem().toString();
                if (str_city.isEmpty()) {
                    Toast.makeText(VSS_page.this, "Fill the details", Toast.LENGTH_SHORT).show();
                } else {
                    getProductByCode(str_city);
                    Toast.makeText(VSS_page.this, "successfully entered"+str_city, Toast.LENGTH_SHORT).show();
                }
            }
            });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String str_vehicle_station_name = list.getItemAtPosition(position).toString();

                sharedPrefHandler.setSharedPreferences("station", str_vehicle_station_name);

                Intent intent = new Intent(getApplication(),Vehicle_service_station_details.class);
                startActivity(intent);
                finish();


            }
        });
        }

    private void getProductByCode(final String str_city) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<ServiceArray>> call = api.getServiceName(str_city);

        call.enqueue(new Callback<List<ServiceArray>>() {
            @Override
            public void onResponse(Call<List<ServiceArray>> call, Response<List<ServiceArray>> response) {
                // List<Product> responseResult = response.body();
                productList = response.body();

                Boolean isSuccess = false;
                if(productList != null) {
                    isSuccess = true;
                }

                if(isSuccess) {

                    // responseResult.getSuccess();
                    // Update all field with result data

                    loadProductListView();

                } else {


                }
            }

            @Override
            public void onFailure(Call<List<ServiceArray>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void loadProductListView() {
        //Creating an String array for the ListView
        products = new String[productList.size()];



        //looping through all the products and inserting the names inside the string array
        for (int i = 0; i < productList.size(); i++) {
            products[i] = productList.get(i).getStationname();
        }

        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv_listitem, products);
        list.setAdapter(adapter);





    }

}






