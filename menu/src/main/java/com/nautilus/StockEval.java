package com.nautilus;

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



public class StockEval {
    private String url_string;
  //  private Object ticker;
    private Object open_stock_price;
    private Object closed_stock_price;
    private Object stock_price_hi;
    private Object stock_price_lo;
    private Object prev_open_stock_price;
    private Object prev_closed_stock_price;
    private Object prev_stock_price_hi;
    private Object prev_stock_price_lo;
    private Object percent_gain;
    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }

    public StockEval(String ticker) {
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
            Map<String, Object> stockMap = stock_data.get(0);
            Map<String, Object> prevStockMap = stock_data.get(4);
            Map<String, Object> sysMap = jsonToMap(results.get("sys").toString());

            ticker = results.get("ticker").toString();
            open_stock_price = stockMap.get("o");
            closed_stock_price = stockMap.get("c");
            stock_price_hi = stockMap.get("h");
            stock_price_lo = stockMap.get("l");
            prev_open_stock_price = prevStockMap.get("o");
            prev_closed_stock_price = prevStockMap.get("c");
            prev_stock_price_hi = prevStockMap.get("h");
            prev_stock_price_lo = prevStockMap.get("l");

            Double prev = (Double)prevStockMap.get("o");
            Double stock = (Double)stockMap.get("o");

            percent_gain = ((stock/prev));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object returnOpenStock() {
        return open_stock_price;
    }

    public Object returnClosedStock() {
        return closed_stock_price;
    }

    public Object returnStockHi() {
        return stock_price_hi;
    }

    public Object returnStockLo() {
        return stock_price_lo;
    }

    public Object returnPrevOpenStock() {
        return prev_open_stock_price;
    }

    public Object returnPrevClosedStock() {
        return prev_closed_stock_price;
    }

    public Object returnPrevStockHi() {
        return prev_stock_price_hi;
    }

    public Object returnPrevStockLo() {
        return prev_stock_price_lo;
    }
    public Object returnStockGain() {
        return percent_gain;
    }
}

