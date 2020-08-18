package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPref {
    private static SharedPreferences sharedPreferences;
    private SharedPreferences.Editor et;
    private static  MySharedPref mySharedPref;

    public MySharedPref(Context Context) {
        sharedPreferences= Context.getSharedPreferences(MyConstants.DatabaseName, Context.MODE_PRIVATE);
        et=sharedPreferences.edit();
    }
    public static  final MySharedPref getInstance(Context Context)
    { if(mySharedPref==null)
        mySharedPref=new MySharedPref(Context);
        return mySharedPref;
    }
    public String getEmail()
    {
        return sharedPreferences.getString(MyConstants.email,MyConstants.default1);
    }
    public void setEmail(String email)
    {
        et.putString(MyConstants.email,email).commit();
    }
    public String getPassword()
    {
        return sharedPreferences.getString(MyConstants.password,MyConstants.default2);
    }
    public void setPassword(String email)
    {
        et.putString(MyConstants.password,email).commit();
    }
    public String getNumber()
    {
        return sharedPreferences.getString(MyConstants.phone,MyConstants.default3);
    }
    public void setNumber(String email)
    {
        et.putString(MyConstants.phone,email).commit();
    }

    public String getStatus()
    {
        return sharedPreferences.getString(MyConstants.check_box,MyConstants.default4);
    }
    public void setStatus(String status)
    {
        et.putString(MyConstants.check_box,status).commit();
    }

}
