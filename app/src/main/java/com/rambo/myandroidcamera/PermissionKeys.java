package com.rambo.myandroidcamera;

import android.Manifest;

/**
 * Created by android1 on 7/12/16.
 */

public class PermissionKeys {

    //request code for permission
    public static final int REQUEST_CODE_ACCESS_FINE_LOCATION=1;
    public static final int REQUEST_CODE_ACCESS_COARSE_LOCATION=2;
    public static final int REQUEST_CODE_ACCESS_NETWORK_STATE=3;
    public static final int REQUEST_CODE_ACCESS_WIFI_STATE=4;
    public static final int REQUEST_CODE_CALL_PHONE=5;
    public static final int REQUEST_CODE_CAMERA=7;
    public static final int REQUEST_CODE_READ_CONTACTS=8;
    public static final int REQUEST_CODE_READ_EXTERNAL_STORAGE=9;
    public static final int REQUEST_CODE_READ_PHONE_STATE=10;
    public static final int REQUEST_CODE_WAKE_LOCK=11;
    public static final int REQUEST_CODE_WRITE_EXTERNAL_STORAGE=12;


    public static final int REQUEST_CODE_PERMISSION_ALL=13;


    //permission name
    public static final String PERMISSION_ACCESS_FINE_LOCATION= Manifest.permission.ACCESS_FINE_LOCATION;
    public static final String PERMISSION_ACCESS_COARSE_LOCATION= Manifest.permission.ACCESS_COARSE_LOCATION;
    public static final String PERMISSION_ACCESS_NETWORK_STATE= Manifest.permission.ACCESS_NETWORK_STATE;
    public static final String PERMISSION_ACCESS_WIFI_STATE= Manifest.permission.ACCESS_WIFI_STATE;
    public static final String PERMISSION_CALL_PHONE= Manifest.permission.CALL_PHONE;
    public static final String PERMISSION_CAMERA= Manifest.permission.CAMERA;
    public static final String PERMISSION_READ_CONTACTS= Manifest.permission.READ_CONTACTS;
    public static final String PERMISSION_READ_EXTERNAL_STORAGE= Manifest.permission.READ_EXTERNAL_STORAGE;
    public static final String PERMISSION_READ_PHONE_STATE= Manifest.permission.READ_PHONE_STATE;
    public static final String PERMISSION_WAKE_LOCK= Manifest.permission.WAKE_LOCK;
    public static final String PERMISSION_WRITE_EXTERNAL_STORAGE= Manifest.permission.WRITE_EXTERNAL_STORAGE;

}

