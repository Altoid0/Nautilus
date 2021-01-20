package com.weather;


public class Controller {
    public static void main(String[] args) {
        ApiCall test = new ApiCall("Cupertino");
        System.out.print(test.returnFeels());
    }
}
