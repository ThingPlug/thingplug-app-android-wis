package com.skt.onem2m_service;

import android.hardware.Sensor;

/**
 * default values for application
 *
 * Copyright (C) 2017. SK Telecom, All Rights Reserved.
 * Written 2017, by SK Telecom
 */
public class Const {

    // ThingPlug URLs
    public static final String URL_JOIN_THINGPLUG = "http://thingplugsvc.sktiot.com/";
    public static final String URL_LOGIN_DEFAULT = "http://thingplugpf.sktiot.com:9000";
    public static final String URL_SEARCH_DEFAULT = "http://thingplugpf.sktiot.com:9000";
    public static final String URL_REGISTER_DEFAULT = "http://thingplugsvc.sktiot.com";
    public static final String URL_LOGIN = "/ThingPlug?division=user&function=login";
    public static final String URL_SEARCH_DEVICE = "/ThingPlug?division=searchDevice&function=myDevice&startIndex=1&countPerPage=50";
    public static final String URL_REGISTER_DEVICE = "/ThingPlug?division=device&function=regist";

    public static final String URL_SERVER_DEFAULT = "thingplugpf.sktiot.com:1883";
    public static final String SERVER_APPEUI_DEFAULT = "9999991000000090"; //for WIS
    public static final boolean USE_TLS_DEFAULT = false;
    public static final boolean USE_TLV_DEFAULT = false;
    public static final boolean SHOW_CONTENT_DEFAULT = true; //for WIS

    // read time delay (msec)
    public static final int SENSOR_DEFAULT_READ_PERIOD = 1000;
    public static final int SENSOR_DEFAULT_TRANSFER_INTERVAL = 5000;
    public static final int SENSOR_DEFAULT_LIST_UPDATE_INTERVAL = 1000;
    public static final int SENSOR_DEFAULT_GRAPH_UPDATE_INTERVAL = 1000;
    public static final int SENSOR_MIN_READ_PERIOD = 100;
    public static final int SENSOR_MIN_TRANSFER_INTERVAL = 1000;
    public static final int SENSOR_MIN_LIST_UPDATE_INTERVAL = 1000;
    public static final int SENSOR_MIN_GRAPH_UPDATE_INTERVAL = 100;

    // sensor type definition
    public static final int SENSOR_TYPE_BATTERY = Sensor.TYPE_DEVICE_PRIVATE_BASE + 1;
    public static final int SENSOR_TYPE_GPS = Sensor.TYPE_DEVICE_PRIVATE_BASE + 2;
    public static final int SENSOR_TYPE_BUZZER = Sensor.TYPE_DEVICE_PRIVATE_BASE + 3;
    public static final int SENSOR_TYPE_LED = Sensor.TYPE_DEVICE_PRIVATE_BASE + 4;
    public static final int SENSOR_TYPE_CAMERA = Sensor.TYPE_DEVICE_PRIVATE_BASE + 5;
    public static final int SENSOR_TYPE_NOISE = Sensor.TYPE_DEVICE_PRIVATE_BASE + 6;

    // OneM2MWorker
    public static final String ONEM2M_TO = "/v1_0";

    public static final String CONTAINER_LORA_NAME = "LoRa";
    public static final String CONTAINER_PHOTOURL_NAME = "PhotoURL";

    public static final String MGMTCMD_NAME = "Android";

    public static final int CONTROL_LOOKUP_INTERVAL = 2000; // ms
    public static final int CONTROL_LOOKUP_MAX_COUNT = 3;

    public static final int CONTROL_CAMERA_LOOKUP_INTERVAL = 1000; // ms
    public static final int CONTROL_CAMERA_LOOKUP_MAX_COUNT = 20;

    public static final String EXECRESULT_SUCCESS = "0";
    public static final String EXECRESULT_DENIED = "2";


    public static final boolean FOR_WIS = true;
    public static final String TTV_PREFIX = "SKTP";
    public static final String CMD_PREFIX = "0x80";
}
