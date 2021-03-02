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
    private String url_string1;
    private String url_string2;
    private String url_string3;
    private String url_string4;
    private String url_string5;
    private String url_string6;
    private String url_string7;
    private String currentDate;
  //  private Object ticker;
    private Object open_stock_price;
    private Object closed_stock_price;
    private Object stock_price_hi;
    private Object stock_price_lo;

    private Object open_stock_price_prev1;
    private Object closed_stock_price_prev1;
    private Object stock_price_hi_prev1;
    private Object stock_price_lo_prev1;

    private Object open_stock_price_prev2;
    private Object closed_stock_price_prev2;
    private Object stock_price_hi_prev2;
    private Object stock_price_lo_prev2;

    private Object open_stock_price_prev3;
    private Object closed_stock_price_prev3;
    private Object stock_price_hi_prev3;
    private Object stock_price_lo_prev3;

    private Object open_stock_price_prev4;
    private Object closed_stock_price_prev4;
    private Object stock_price_hi_prev4;
    private Object stock_price_lo_prev4;

    private Object open_stock_price_prev5;
    private Object closed_stock_price_prev5;
    private Object stock_price_hi_prev5;
    private Object stock_price_lo_prev5;

    private Object open_stock_price_prev6;
    private Object closed_stock_price_prev6;
    private Object stock_price_hi_prev6;
    private Object stock_price_lo_prev6;

    private Object open_stock_price_prev7;
    private Object closed_stock_price_prev7;
    private Object stock_price_hi_prev7;
    private Object stock_price_lo_prev7;

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
        String prevDate = currentDate.substring(currentDate.length() - 2);
        int prevDat1 = Integer.parseInt(prevDate)-7;
        int prevDat2 = Integer.parseInt(prevDate)-6;
        int prevDat3 = Integer.parseInt(prevDate)-5;
        int prevDat4 = Integer.parseInt(prevDate)-4;
        int prevDat5 = Integer.parseInt(prevDate)-3;
        int prevDat6 = Integer.parseInt(prevDate)-2;
        int prevDat7 = Integer.parseInt(prevDate)-1;

        String prevDate1 = currentDate.substring(0, 8) + prevDat1;
        String prevDate2 = currentDate.substring(0, 8) + prevDat2;
        String prevDate3 = currentDate.substring(0, 8) + prevDat3;
        String prevDate4 = currentDate.substring(0, 8) + prevDat4;
        String prevDate5 = currentDate.substring(0, 8) + prevDat5;
        String prevDate6 = currentDate.substring(0, 8) + prevDat6;
        String prevDate7 = currentDate.substring(0, 8) + prevDat7;
        System.out.println(prevDate1);

        String API_Key = "QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1";
        url_string = "https://api.polygon.io/v1/open-close/" + ticker + "/" + currentDate + "?unadjusted=true&apiKey=" + API_Key;
        url_string1 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate1 + "?unadjusted=true&apiKey=" + API_Key;
        url_string2 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate2 + "?unadjusted=true&apiKey=" + API_Key;
        url_string3 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate3 + "?unadjusted=true&apiKey=" + API_Key;
        url_string4 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate4 + "?unadjusted=true&apiKey=" + API_Key;
        url_string5 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate5 + "?unadjusted=true&apiKey=" + API_Key;
        url_string6 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate6 + "?unadjusted=true&apiKey=" + API_Key;
        url_string7 = "https://api.polygon.io/v1/open-close/" + ticker + "/" + prevDate7 + "?unadjusted=true&apiKey=" + API_Key;
        //https://api.polygon.io/v1/open-close/AAPL/2020-10-14?unadjusted=true&apiKey=QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1
        System.out.println(url_string);
        System.out.println(url_string1);
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

            ticker = results.get("symbol").toString();
            open_stock_price = results.get("open");
            closed_stock_price = results.get("close");
            stock_price_hi = results.get("high");
            stock_price_lo = results.get("low");

            StringBuilder result1 = new StringBuilder();
            URL url1 = new URL(url_string1);
            URLConnection conn1 = url.openConnection();
            BufferedReader rd1 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line1;
            while ((line1 = rd1.readLine()) != null) {
                result1.append(line1);
            }
            rd.close();

            Map<String, Object> results1 = jsonToMap(result.toString());

            ticker = results1.get("symbol").toString();
            open_stock_price_prev1 = results1.get("open");
            closed_stock_price_prev1 = results1.get("close");
            stock_price_hi_prev1 = results1.get("high");
            stock_price_lo_prev1 = results1.get("low");



            StringBuilder result2 = new StringBuilder();
            URL url2 = new URL(url_string2);
            URLConnection conn2 = url.openConnection();
            BufferedReader rd2 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line2;
            while ((line2 = rd2.readLine()) != null) {
                result2.append(line2);
            }
            rd.close();

            Map<String, Object> results2 = jsonToMap(result.toString());

            ticker = results2.get("symbol").toString();
            open_stock_price_prev2 = results2.get("open");
            closed_stock_price_prev2 = results2.get("close");
            stock_price_hi_prev2 = results2.get("high");
            stock_price_lo_prev2 = results2.get("low");
            System.out.println(stock_price_lo_prev2.toString());


            StringBuilder result3 = new StringBuilder();
            URL url3 = new URL(url_string3);
            URLConnection conn3 = url.openConnection();
            BufferedReader rd3 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line3;
            while ((line3 = rd.readLine()) != null) {
                result3.append(line3);
            }
            rd.close();

            Map<String, Object> results3 = jsonToMap(result.toString());

            ticker = results.get("symbol").toString();
            open_stock_price_prev3 = results3.get("open");
            closed_stock_price_prev3 = results3.get("close");
            stock_price_hi_prev3 = results3.get("high");
            stock_price_lo_prev3 = results3.get("low");


            StringBuilder result4 = new StringBuilder();
            URL url4 = new URL(url_string4);
            URLConnection conn4 = url.openConnection();
            BufferedReader rd4 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line4;
            while ((line4 = rd.readLine()) != null) {
                result4.append(line4);
            }
            rd.close();

            Map<String, Object> results4 = jsonToMap(result.toString());

            ticker = results.get("symbol").toString();
            open_stock_price_prev4 = results4.get("open");
            closed_stock_price_prev4 = results4.get("close");
            stock_price_hi_prev4 = results4.get("high");
            stock_price_lo_prev4 = results4.get("low");


            StringBuilder result5 = new StringBuilder();
            URL url5 = new URL(url_string);
            URLConnection conn5 = url.openConnection();
            BufferedReader rd5 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line5;
            while ((line5 = rd.readLine()) != null) {
                result5.append(line5);
            }
            rd.close();

            Map<String, Object> results5 = jsonToMap(result.toString());

            ticker = results.get("symbol").toString();
            open_stock_price_prev5 = results5.get("open");
            closed_stock_price_prev5 = results5.get("close");
            stock_price_hi_prev5 = results5.get("high");
            stock_price_lo_prev5 = results5.get("low");


            StringBuilder result6 = new StringBuilder();
            URL url6 = new URL(url_string);
            URLConnection conn6 = url.openConnection();
            BufferedReader rd6 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line6;
            while ((line6 = rd.readLine()) != null) {
                result6.append(line6);
            }
            rd.close();

            Map<String, Object> results6 = jsonToMap(result.toString());

            ticker = results.get("symbol").toString();
            open_stock_price_prev6 = results6.get("open");
            closed_stock_price_prev6 = results6.get("close");
            stock_price_hi_prev6 = results6.get("high");
            stock_price_lo_prev6 = results6.get("low");


            StringBuilder result7 = new StringBuilder();
            URL url7 = new URL(url_string);
            URLConnection conn7 = url.openConnection();
            BufferedReader rd7 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line7;
            while ((line7 = rd.readLine()) != null) {
                result7.append(line7);
            }
            rd.close();

            Map<String, Object> results7 = jsonToMap(result.toString());

            ticker = results.get("symbol").toString();
            open_stock_price_prev7 = results7.get("open");
            closed_stock_price_prev7 = results7.get("close");
            stock_price_hi_prev7 = results7.get("high");
            stock_price_lo_prev7 = results7.get("low");




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

    public Object returnOpenStock1() {
        return open_stock_price_prev1;
    }

    public Object returnClosedStock1() {
        return closed_stock_price_prev1;
    }

    public Object returnStockHi1() {
        return stock_price_hi_prev1;
    }

    public Object returnStockLo1() {
        return stock_price_lo_prev1;
    }

    public Object returnOpenStock2() {
        return open_stock_price_prev2;
    }

    public Object returnClosedStock2() {
        return closed_stock_price_prev2;
    }

    public Object returnStockHi2() {
        return stock_price_hi_prev2;
    }

    public Object returnStockLo2() {
        return stock_price_lo_prev2;
    }

    public Object returnOpenStock3() {
        return open_stock_price_prev3;
    }

    public Object returnClosedStock3() {
        return closed_stock_price_prev3;
    }

    public Object returnStockHi3() {
        return stock_price_hi_prev3;
    }

    public Object returnStockLo3() {
        return stock_price_lo_prev3;
    }

    public Object returnOpenStock4() {
        return open_stock_price_prev4;
    }

    public Object returnClosedStock4() {
        return closed_stock_price_prev4;
    }

    public Object returnStockHi4() {
        return stock_price_hi_prev4;
    }

    public Object returnStockLo4() {
        return stock_price_lo_prev4;
    }

    public Object returnOpenStock5() {
        return open_stock_price_prev5;
    }

    public Object returnClosedStock5() {
        return closed_stock_price_prev5;
    }

    public Object returnStockHi5() {
        return stock_price_hi_prev5;
    }

    public Object returnStockLo5() {
        return stock_price_lo_prev5;
    }

    public Object returnOpenStock6() {
        return open_stock_price_prev6;
    }

    public Object returnClosedStock6() {
        return closed_stock_price_prev6;
    }

    public Object returnStockHi6() {
        return stock_price_hi_prev6;
    }

    public Object returnStockLo6() {
        return stock_price_lo_prev6;
    }

    public Object returnOpenStock7() {
        return open_stock_price_prev7;
    }

    public Object returnClosedStock7() {
        return closed_stock_price_prev7;
    }

    public Object returnStockHi7() {
        return stock_price_hi_prev7;
    }

    public Object returnStockLo7() {
        return stock_price_lo_prev7;
    }

}

