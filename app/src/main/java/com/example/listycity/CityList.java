package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks whether the list contains a city or not
     * @param city
     * This is the city to check
     * @return
     * whether the list contains this city (true or false)
     */
    public boolean hasCity(City city)
    {
        return cities.contains(city);
    }

    /**
     * This counts the number of cities in the list
     * @return
     * the number of cities
     */
    public int countCities()
    {
        return cities.size();
    }

    /**
     * This removes a city from the list if it exists
     * @param city
     * This is the city to be deleted
     * @throws IllegalArgumentException
     * Thrown if the city does not exist in the list
     */
    public void delete(City city) {
        if (!this.hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

}