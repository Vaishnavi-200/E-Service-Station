package com.example.hp.e_service_station;

/**
 * Created by HP on 12-09-2022.
 */
public class IsExist {
    private Boolean success;

    public IsExist(Boolean success)
    {
        this.success = success;
    }

    public Boolean getSuccess()
    {
        return success;
    }

    public void setSuccess(Boolean success)
    {
        this.success = success;
    }
}