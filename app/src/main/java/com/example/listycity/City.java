package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City otherCity) {
        // We compare the String names of the cities
        return this.city.compareTo(otherCity.getCityName());
    }
}
