package com.example.hp.e_service_station;

/**
 * Created by HP on 12-09-2022.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "https://courant-conversion.000webhostapp.com/API2/";


    @POST("insert_signup.php")
    Call<IsExist> Signup_page(
            @Query("f1") String firstname,
            @Query("f2") String lastname,
            @Query("f3") String mobile,
            @Query("f4") String email,
            @Query("f5") String city,
            @Query("f6") String postal,
            @Query("f7") String pass
    );


    @GET("https://courant-conversion.000webhostapp.com/API2/get_user_profile.php")
    Call<List<UserAccount_Array>> getUserDetails(@Query("f1") String str_shr_umno);

    @GET("https://courant-conversion.000webhostapp.com/API2/get_stationname.php")
    Call<List<ServiceArray>> getServiceName(@Query("f1") String str_city);

    @GET("https://courant-conversion.000webhostapp.com/API2/get_Cstationname.php")
    Call<List<ChargeArray>> getChargeName(@Query("f1") String str_cities);



    @POST("Update_UserAccount.php")
    Call<IsExist> updatepage(
            @Query("f1") String firstname,
            @Query("f2") String lastname,
            @Query("f3") String mno,
            @Query("f4") String email,
            @Query("f5") String city,
            @Query("f6") String postal,
            @Query("f7") String pass
    );


    @GET("https://courant-conversion.000webhostapp.com/API2/get_station_details.php")
    Call<List<ServiceArray>> getServiceDetails(@Query("f1") String string);


    @GET("https://courant-conversion.000webhostapp.com/API2/get_Cstation_details.php")
    Call<List<ChargeArray>> getChargeDetails(@Query("f1") String string_charge);

}