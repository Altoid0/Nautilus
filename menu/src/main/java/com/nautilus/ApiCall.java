package com.nautilus;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApiCall {
    private String url_string;
    private Object current_temp;
    private Object feels_temp;
    private Object forecast;
    private Object max_temp;
    private Object min_temp;
    private Object sunrise;
    private Object sunset;
    private Object humidity;


    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }

    public ApiCall(String location) {
        String API_KEY = "349925271f7fdbe982d6825f10c6a0c3";
        url_string = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY + "&units=imperial";

        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(url_string);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result .append(line);
            }
            rd.close();



            Map<String, Object> respMap = jsonToMap(result.toString());
            Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
            ArrayList<Map<String,Object>> weathers = (ArrayList<Map<String, Object>>) respMap.get("weather");
            Map<String, Object> weatherMap = weathers.get(0);
            Map<String, Object> sysMap = jsonToMap(respMap.get("sys").toString());

            current_temp = mainMap.get("temp");
            feels_temp = mainMap.get("feels_like");
            forecast = weatherMap.get("description");
            max_temp = mainMap.get("temp_max");
            min_temp = mainMap.get("temp_min");
            sunrise = sysMap.get("sunrise");
            sunset = sysMap.get("sunrise");
            humidity = mainMap.get("humidity");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Object returnCurrent() {
        return current_temp;
    }

    public Object returnFeels() {
        return feels_temp;
    }

    public Object returnForecast() {
        return forecast;
    }

    public Object returnMax() {
        return max_temp;
    }

    public Object returnMin() {
        return min_temp;
    }

    public Object returnSunrise() {
        return sunrise;
    }

    public Object returnSunset() {
        return sunset;
    }

    public Object returnHumidity() {
        return humidity;
    }

}