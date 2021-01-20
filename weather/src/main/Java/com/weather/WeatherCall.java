package com.weather;

import org.springframework.beans.factory.annotation.Autowired;

public class WeatherCall {
    @Autowired
    private Entity weatherCall;
    private String Location;
    Entity call = new Entity();

    public WeatherCall(String l) {
        Location = l;
    }

    public City getWeather() {
        return weatherCall.getWeatherByCity(Location);
    }


}
