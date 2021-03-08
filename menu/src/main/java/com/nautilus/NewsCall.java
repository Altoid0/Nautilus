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

public class NewsCall {
    private String url_string;
    private Map<String, Object> articleA;
    public String articleAsource;
    private Map<String, Object> articleB;
    private Map<String, Object> articleC;
    private Map<String, Object> articleD;
    private Map<String, Object> articleE;
    private Map<String, Object> articleF;
    private Map<String, Object> articleG;
    private Map<String, Object> articleH;
    private Map<String, Object> articleI;
    private Map<String, Object> articleJ;
    private Map<String, Object> articleK;
    private Map<String, Object> articleL;
    private Map<String, Object> articleM;
    private Map<String, Object> articleN;
    private Map<String, Object> articleO;

    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }

    public NewsCall() {
        String API_KEY = "064bc6ba0bc54a5ab590561256ca6fa8";
        url_string = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" + API_KEY;

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


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public ArrayList article1() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleA.get("author").toString());
        articleinfo.add(articleA.get("title").toString());
        articleinfo.add(articleA.get("description").toString());
        articleinfo.add(articleA.get("url").toString());
        articleinfo.add(articleA.get("urlToImage").toString());
        articleinfo.add(articleA.get("publishedAt").toString());
        articleinfo.add(articleA.get("content").toString());
        return articleinfo;
    }

    public ArrayList article2() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleB.get("author").toString());
        articleinfo.add(articleB.get("title").toString());
        articleinfo.add(articleB.get("description").toString());
        articleinfo.add(articleB.get("url").toString());
        articleinfo.add(articleB.get("urlToImage").toString());
        articleinfo.add(articleB.get("publishedAt").toString());
        articleinfo.add(articleB.get("content").toString());
        return articleinfo;
    }

    public ArrayList article3() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleC.get("author").toString());
        articleinfo.add(articleC.get("title").toString());
        articleinfo.add(articleC.get("description").toString());
        articleinfo.add(articleC.get("url").toString());
        articleinfo.add(articleC.get("publishedAt").toString());
        articleinfo.add(articleC.get("urlToImage").toString());
        articleinfo.add(articleC.get("content").toString());
        return articleinfo;
    }

    public ArrayList article4() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleD.get("author").toString());
        articleinfo.add(articleD.get("title").toString());
        articleinfo.add(articleD.get("description").toString());
        articleinfo.add(articleD.get("url").toString());
        articleinfo.add(articleD.get("urlToImage").toString());
        articleinfo.add(articleD.get("publishedAt").toString());
        articleinfo.add(articleD.get("content").toString());
        return articleinfo;
    }

    public ArrayList article5() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleE.get("author").toString());
        articleinfo.add(articleE.get("title").toString());
        articleinfo.add(articleE.get("description").toString());
        articleinfo.add(articleE.get("url").toString());
        articleinfo.add(articleE.get("urlToImage").toString());
        articleinfo.add(articleE.get("publishedAt").toString());
        articleinfo.add(articleE.get("content").toString());
        return articleinfo;
    }

    public ArrayList article6() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleF.get("author").toString());
        articleinfo.add(articleF.get("title").toString());
        articleinfo.add(articleF.get("description").toString());
        articleinfo.add(articleF.get("url").toString());
        articleinfo.add(articleF.get("urlToImage").toString());
        articleinfo.add(articleF.get("publishedAt").toString());
        articleinfo.add(articleF.get("content").toString());
        return articleinfo;
    }

    public ArrayList article7() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleG.get("author").toString());
        articleinfo.add(articleG.get("title").toString());
        articleinfo.add(articleG.get("description").toString());
        articleinfo.add(articleG.get("url").toString());
        articleinfo.add(articleG.get("urlToImage").toString());
        articleinfo.add(articleG.get("publishedAt").toString());
        articleinfo.add(articleG.get("content").toString());
        return articleinfo;
    }

    public ArrayList article8() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleH.get("author").toString());
        articleinfo.add(articleH.get("title").toString());
        articleinfo.add(articleH.get("description").toString());
        articleinfo.add(articleH.get("url").toString());
        articleinfo.add(articleH.get("urlToImage").toString());
        articleinfo.add(articleH.get("publishedAt").toString());
        articleinfo.add(articleH.get("content").toString());
        return articleinfo;
    }

    public ArrayList article9() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleI.get("author").toString());
        articleinfo.add(articleI.get("title").toString());
        articleinfo.add(articleI.get("description").toString());
        articleinfo.add(articleI.get("url").toString());
        articleinfo.add(articleI.get("urlToImage").toString());
        articleinfo.add(articleI.get("publishedAt").toString());
        articleinfo.add(articleI.get("content").toString());
        return articleinfo;
    }

    public ArrayList article10() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleJ.get("author").toString());
        articleinfo.add(articleJ.get("title").toString());
        articleinfo.add(articleJ.get("description").toString());
        articleinfo.add(articleJ.get("url").toString());
        articleinfo.add(articleJ.get("urlToImage").toString());
        articleinfo.add(articleJ.get("publishedAt").toString());
        articleinfo.add(articleJ.get("content").toString());
        return articleinfo;
    }

    public ArrayList article11() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleK.get("author").toString());
        articleinfo.add(articleK.get("title").toString());
        articleinfo.add(articleK.get("description").toString());
        articleinfo.add(articleK.get("url").toString());
        articleinfo.add(articleK.get("urlToImage").toString());
        articleinfo.add(articleK.get("publishedAt").toString());
        articleinfo.add(articleK.get("content").toString());
        return articleinfo;
    }

    public ArrayList article12() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleL.get("author").toString());
        articleinfo.add(articleL.get("title").toString());
        articleinfo.add(articleL.get("description").toString());
        articleinfo.add(articleL.get("url").toString());
        articleinfo.add(articleL.get("urlToImage").toString());
        articleinfo.add(articleL.get("publishedAt").toString());
        articleinfo.add(articleL.get("content").toString());
        return articleinfo;
    }

    public ArrayList article13() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleM.get("author").toString());
        articleinfo.add(articleM.get("title").toString());
        articleinfo.add(articleM.get("description").toString());
        articleinfo.add(articleM.get("url").toString());
        articleinfo.add(articleM.get("urlToImage").toString());
        articleinfo.add(articleM.get("publishedAt").toString());
        articleinfo.add(articleM.get("content").toString());
        return articleinfo;
    }

    public ArrayList article14() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleN.get("author").toString());
        articleinfo.add(articleN.get("title").toString());
        articleinfo.add(articleN.get("description").toString());
        articleinfo.add(articleN.get("url").toString());
        articleinfo.add(articleN.get("urlToImage").toString());
        articleinfo.add(articleN.get("publishedAt").toString());
        articleinfo.add(articleN.get("content").toString());
        return articleinfo;
    }

    public ArrayList article15() {
        ArrayList<String> articleinfo = new ArrayList<String>();
        articleinfo.add(articleO.get("author").toString());
        articleinfo.add(articleO.get("title").toString());
        articleinfo.add(articleO.get("description").toString());
        articleinfo.add(articleO.get("url").toString());
        articleinfo.add(articleO.get("urlToImage").toString());
        articleinfo.add(articleO.get("publishedAt").toString());
        articleinfo.add(articleO.get("content").toString());
        return articleinfo;
    }

}
