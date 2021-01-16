package com.weather;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.weather.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Entity {
    //Creates map for dynamodb request
    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public City getWeatherByCity(String Location) {
        return dynamoDBMapper.load(City.class, Location);
    }

}
