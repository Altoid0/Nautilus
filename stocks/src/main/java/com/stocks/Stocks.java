package com.stocks;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    private Object stock_price;
    private Object stock_val;

    public Stocks(String ticker) {
        String API_Key = "QSnjRpHBcP7QcFMp2XEhk4GG1EYlJ9X1";
        url_string = "https://api.polygon.io/v2/aggs/ticker/" + ticker "/range/1/day/2020-06-01/2020-06-17?apiKey="+ API_Key;

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
        }
    }
}
