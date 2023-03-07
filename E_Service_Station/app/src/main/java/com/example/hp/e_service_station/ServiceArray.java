package com.example.hp.e_service_station;

/**
 * Created by hp on 9/14/2022.
 */
public class ServiceArray {
    private  String stationid;
    private  String stationname;
    private  String city;
    private  String address;
    private  String mno;
    private  String portdetails;
    private  String servicecharge;
    private  String latitude;
    private  String longitude;




    public ServiceArray(String stationid, String stationname,String city,String address, String mno, String portdetails,String servicecharge,String latitude,String longitude)
    {
        this.stationid=stationid;
        this.stationname=stationname;
        this.city=city;
        this.address=address;
        this.mno=mno;
        this.portdetails=portdetails;
        this.servicecharge=servicecharge;
        this.latitude=latitude;
        this.longitude=longitude;

    }
    public String getstationid(){
        return  stationid;

    }
    public String getStationname(){
        return  stationname;

    }

    public String getCity(){
        return  city;

    }


    public String getAddress(){
        return  address;

    }

    public String getMno() {
        return mno;

    }

    public String getPortdetails(){
        return  portdetails;

    }

    public String getServicecharge(){
        return  servicecharge;

    }

    public String getLatitude(){
        return  latitude;

    }

    public String getLongitude(){
        return  longitude;

    }


}