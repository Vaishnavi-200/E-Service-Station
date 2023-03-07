package com.example.hp.e_service_station;

/**
 * Created by HP on 14-09-2022.
 */
public class UserAccount_Array {
    private String firstname;
    private String lastname;
    private String mno;
    private String email;
    private String city;
    private String address;
    private String password;

    public UserAccount_Array(String mno,String firstname, String lastname,String email, String city,String password)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.mno=mno;
        this.email=email;
        this.city=city;
        this.address=address;
        this.password=password;
    }
    public String getFirstname(){
        return  firstname;
    }
    public String getLastname(){
        return  lastname;
    }
    public String getMno(){
        return  mno;
    }
    public String getEmail(){
        return  email;
    }
    public String getCity(){
        return  city;
    }
    public String getAddress(){
        return  address;
    }
    public String getPassword(){
        return  password;
    }

}

