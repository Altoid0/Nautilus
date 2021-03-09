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

    private Object open_stock_price_day1;
    private Object closed_stock_price_day1;
    private Object stock_price_hi_day1;
    private Object stock_price_lo_day1;

    private Object open_stock_price_day2;
    private Object closed_stock_price_day2;
    private Object stock_price_hi_day2;
    private Object stock_price_lo_day2;

    private Object open_stock_price_day3;
    private Object closed_stock_price_day3;
    private Object stock_price_hi_day3;
    private Object stock_price_lo_day3;

    private Object open_stock_price_day4;
    private Object closed_stock_price_day4;
    private Object stock_price_hi_day4;
    private Object stock_price_lo_day4;

    private Object open_stock_price_day5;
    private Object closed_stock_price_day5;
    private Object stock_price_hi_day5;
    private Object stock_price_lo_day5;

    private Object open_stock_price_day6;
    private Object closed_stock_price_day6;
    private Object stock_price_hi_day6;
    private Object stock_price_lo_day6;



    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }


    public StockEval(String ticker) {
        LocalDate currentdate = LocalDate.now();
        currentDate = currentdate.toString();
        currentDate = "2021-03-08";
        String prevDate = currentDate.substring(currentDate.length() - 7);
        String prevdate = "2021-03-01";




        String API_Key = "QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1";
        url_string = "https://api.polygon.io/v2/aggs/ticker/" + ticker + "/range/1/day/2021-03-01/2021-03-08?apiKey=" + API_Key;

        //https://api.polygon.io/v1/open-close/AAPL/2020-10-14?unadjusted=true&apiKey=QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1
        System.out.println(url_string);
        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(url_string);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();

            Map<String, Object> results = jsonToMap(result.toString());
            ArrayList<Map<String,Object>> res = (ArrayList<Map<String, Object>>) results.get("results");
            Map<String, Object> day1 = res.get(0);
            Map<String, Object> day2 = res.get(1);
            Map<String, Object> day3 = res.get(2);
            Map<String, Object> day4 = res.get(3);
            Map<String, Object> day5 = res.get(4);
            Map<String, Object> day6 = res.get(5);




            ticker = results.get("ticker").toString();
            open_stock_price = day6.get("o");
            closed_stock_price = day6.get("c");
            stock_price_hi = day6.get("h");
            stock_price_lo = day6.get("l");
            System.out.println(open_stock_price);

            open_stock_price_day1 = day1.get("o");
            closed_stock_price_day1 = day1.get("c");
            stock_price_hi_day1 = day1.get("h");
            stock_price_lo_day1 = day1.get("l");
            System.out.println(open_stock_price_day1);

            open_stock_price_day2 = day2.get("o");
            closed_stock_price_day2 = day2.get("c");
            stock_price_hi_day2 = day2.get("h");
            stock_price_lo_day2 = day2.get("l");
            System.out.println(open_stock_price_day2);

            open_stock_price_day3 = day3.get("o");
            closed_stock_price_day3 = day3.get("c");
            stock_price_hi_day3 = day3.get("h");
            stock_price_lo_day3 = day3.get("l");

            open_stock_price_day4 = day4.get("o");
            closed_stock_price_day4 = day4.get("c");
            stock_price_hi_day4 = day4.get("h");
            stock_price_lo_day4 = day4.get("l");

            open_stock_price_day5 = day5.get("o");
            closed_stock_price_day5 = day5.get("c");
            stock_price_hi_day5 = day5.get("h");
            stock_price_lo_day5 = day5.get("l");
            System.out.println(open_stock_price_day5);

            open_stock_price_day6 = day6.get("o");
            closed_stock_price_day6 = day6.get("c");
            stock_price_hi_day6 = day6.get("h");
            stock_price_lo_day6 = day6.get("l");
            System.out.println(open_stock_price_day6);

        }

        catch (MalformedURLException e) {
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


    public Object returnOpenStock1() {
        return open_stock_price_day1;
    }

    public Object returnClosedStock1() {
        return closed_stock_price_day1;
    }

    public Object returnStockHi1() {
        return stock_price_hi_day1;
    }

    public Object returnStockLo1() {
        return stock_price_lo_day1;
    }


    public Object returnOpenStock2() {
        return open_stock_price_day2;
    }

    public Object returnClosedStock2() {
        return closed_stock_price_day2;
    }

    public Object returnStockHi2() {
        return stock_price_hi_day2;
    }

    public Object returnStockLo2() {
        return stock_price_lo_day2;
    }


    public Object returnOpenStock3() {
        return open_stock_price_day3;
    }

    public Object returnClosedStock3() {
        return closed_stock_price_day3;
    }

    public Object returnStockHi3() {
        return stock_price_hi_day3;
    }

    public Object returnStockLo3() {
        return stock_price_lo_day3;
    }


    public Object returnOpenStock4() {
        return open_stock_price_day4;
    }

    public Object returnClosedStock4() {
        return closed_stock_price_day4;
    }

    public Object returnStockHi4() {
        return stock_price_hi_day4;
    }

    public Object returnStockLo4() {
        return stock_price_lo_day4;
    }


    public Object returnOpenStock5() {
        return open_stock_price_day5;
    }

    public Object returnClosedStock5() {
        return closed_stock_price_day5;
    }

    public Object returnStockHi5() {
        return stock_price_hi_day5;
    }

    public Object returnStockLo5() {
        return stock_price_lo_day5;
    }


    public Object returnOpenStock6() {
        return open_stock_price_day6;
    }

    public Object returnClosedStock6() {
        return closed_stock_price_day6;
    }

    public Object returnStockHi6() {
        return stock_price_hi_day6;
    }

    public Object returnStockLo6() {
        return stock_price_lo_day6;
    }





}

