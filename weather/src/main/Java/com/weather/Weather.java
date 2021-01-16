package com.weather;

import com.weather.Controller;


public class Weather {
    public static void main(String[] args) {
        Controller test = new Controller();
        test.getWeather("Cupertino");
        System.out.println("This worked");
    }
}
