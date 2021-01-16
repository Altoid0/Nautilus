package com.weather;

import com.weather.City;
import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    private Entity weatherCall;

    public City getWeather(String Location) {
        return weatherCall.getWeatherByCity(Location);
    }


}
