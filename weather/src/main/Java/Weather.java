package Weather.Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




import com.google.gson.*;
import com.google.gson.reflect.*;


//application
@SpringBootApplication

public class Weather {
    @RequestMapping(value = "/weather")


    public static void WeatherCheck(String[] args) {
        Scanner rps = new Scanner(System.in);
        String API_KEY = "349925271f7fdbe982d6825f10c6a0c3";

        System.out.println("What city do you want to know the weather in?");
        String userInput = rps.nextLine();

        String url_string = "api.openweathermap.org/data/2.5/weather?q=" + userInput + "&appid=" + API_KEY + "&units=imperial";

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
            System.out.println(result);

            Map<String, Object> respMap = jsonToMap(result.toString());
            Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
            Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
            Map<String, Object> weatherMap = jsonToMap(respMap.get("weather").toString());
            Map<String, Object> rainMap = jsonToMap(respMap.get("rain").toString());
            Map<String, Object> sysMap = jsonToMap(respMap.get("sys").toString());

            String current_temp = mainMap.get("temp");'
            String feels_temp = mainMap.get("feels_like");
            String forecast = mainMap.get("description");
            String max_temp = mainMap.get("temp_max");

//add min max temps, and sunrise sunset
            System.out.println("Current Temperature in " + userInput + ": " + mainMap.get("temp"));
            System.out.println("Feels like " + mainMap.get("feels_like") + "in " + userInput);
            System.out.println("Current Forecast in " + userInput + ": " + weatherMap.get("description"));
            System.out.println("Maximum Temperature for the day in " + userInput + ": " + mainMap.get("temp_max"));
            System.out.println("Minimum Temperature for the day in " + userInput + ": " + mainMap.get("temp_min"));
            System.out.println("Current chance of rain in " + userInput + ": " + rainMap.get("1h"));
            System.out.println("Sun rises at " + sysMap.get("sunrise") + "in " + userInput);
            System.out.println("Sun sets at " + sysMap.get("sunset") + "in " + userInput);

            System.out.println("Current Humidity in " + userInput + ": " + mainMap.get("humidity"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        public String index() {
            return "index";
        }


    }




    public static Map<String, Object> jsonToMap (String str) {
        Map<String, Object> map = new Gson().fromJson (
                str, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        return map;
    }








}

