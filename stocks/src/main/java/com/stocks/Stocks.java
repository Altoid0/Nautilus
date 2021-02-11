package com.stocks;

//import com.google.common.reflect.TypeToken;
//import com.google.gson.Gson;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.time.*;




public class Stocks {
    private String url_string;
    private Object ticker;
    private Object stock_price;
    private Object stock_val;
    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }

    public Stocks(String ticker) {
        String API_Key = "QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1";
        url_string = "https://api.polygon.io/v2/aggs/ticker/" + ticker + "/range/1/day/2020-06-01/2020-06-17?apiKey="+ API_Key;

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

            Map<String, Object> results = jsonToMap(result.toString());

            ArrayList<Map<String,Object>> stock_data = (ArrayList<Map<String, Object>>) results.get("results");
            Map<String, Object> weatherMap = weathers.get(0);
            Map<String, Object> sysMap = jsonToMap(results.get("sys").toString());

            ticker = results.get("ticker").toString();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
