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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;



public class StockEval {
    private String url_string;
    private String currentDate;
  //  private Object ticker;
    private Object open_stock_price;
    private Object closed_stock_price;
    private Object stock_price_hi;
    private Object stock_price_lo;

    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }



    public StockEval(String ticker) {
        LocalDate currentdate = LocalDate.now();

        currentDate = currentdate.toString();
        currentDate = "2021-02-24";
        String API_Key = "QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1";
        url_string = "https://api.polygon.io/v1/open-close/" + ticker + "/" + currentDate + "?unadjusted=true&apiKey=" + API_Key;
        //https://api.polygon.io/v1/open-close/AAPL/2020-10-14?unadjusted=true&apiKey=QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1
        System.out.println(url_string);
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

            ticker = results.get("symbol").toString();
            open_stock_price = results.get("open");
            closed_stock_price = results.get("close");
            stock_price_hi = results.get("high");
            stock_price_lo = results.get("low");



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

}

