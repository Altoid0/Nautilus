package com.news;

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

public class NewsCall {
    private String url_string;
    private Object articleA;
    private Object articleB;
    private Object articleC;
    private Object articleD;
    private Object articleE;
    private Object articleF;
    private Object articleG;
    private Object articleH;
    private Object articleI;
    private Object articleJ;
    private Object articleK;
    private Object articleL;
    private Object articleM;
    private Object articleN;
    private Object articleO;

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

    public NewsCall() {
        String API_KEY = "064bc6ba0bc54a5ab590561256ca6fa8";
        url_string = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" + "&appid=" + API_KEY;

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
            ArrayList<Map<String, Object>> articles = (ArrayList<Map<String, Object>>) respMap.get("articles");
            Map<String, Object> article0 = articles.get(0);
            Map<String, Object> article1 = articles.get(1);
            Map<String, Object> article2 = articles.get(2);
            Map<String, Object> article3 = articles.get(3);
            Map<String, Object> article4 = articles.get(4);
            Map<String, Object> article5 = articles.get(5);
            Map<String, Object> article6 = articles.get(6);
            Map<String, Object> article7 = articles.get(7);
            Map<String, Object> article8 = articles.get(8);
            Map<String, Object> article9 = articles.get(9);
            Map<String, Object> article10 = articles.get(10);
            Map<String, Object> article11 = articles.get(11);
            Map<String, Object> article12 = articles.get(12);
            Map<String, Object> article13 = articles.get(13);
            Map<String, Object> article14 = articles.get(14);


            Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
            ArrayList<Map<String,Object>> weathers = (ArrayList<Map<String, Object>>) respMap.get("weather");
            Map<String, Object> weatherMap = weathers.get(0);
            Map<String, Object> sysMap = jsonToMap(respMap.get("sys").toString());

            articleA = article0;
            articleB = article1;
            articleC = article2;
            articleD = article3;
            articleE = article4;
            articleF = article5;
            articleG = article6;
            articleH = article7;
            articleI = article8;
            articleJ = article9;
            articleK = article10;
            articleL = article11;
            articleM = article12;
            articleN = article13;
            articleO = article14;

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

    public Object article1() {
        return articleA;
    }
    public Object article2() {
        return articleA;
    }
    public Object article3() {
        return articleA;
    }
    public Object article4() {
        return articleA;
    }
    public Object article5() {
        return articleA;
    }
    public Object article6() {
        return articleA;
    }
    public Object article7() {
        return articleA;
    }
    public Object article8() {
        return articleA;
    }
    public Object article9() {
        return articleA;
    }
    public Object article10() {
        return articleA;
    }
    public Object article11() {
        return articleA;
    }
    public Object article12() {
        return articleA;
    }
    public Object article13() {
        return articleA;
    }
    public Object article14() {
        return articleA;
    }
    public Object article15() {
        return articleA;
    }




}
