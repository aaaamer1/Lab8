package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list; /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount(); list.addCity(new City("Estevan", "SK")); assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listsize = list.getCount();
        City city1 = new City("Edmonton", "AB");
        list.addCity(city1);
        list.deleteCity(city1);
        assertEquals(list.getCount(),listsize);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city1 = new City("Toronto", "ON");
        list.addCity(city1);
        assertTrue(list.hasCity(city1));
    }

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        assertEquals(0, list.getCount());
        City city1 = new City("Vancouver", "BC");
        City city2 = new City("Red Deer", "AB");
        list.addCity(city1);
        assertEquals(1, list.getCount());
        list.addCity(city2);
        assertEquals(2, list.getCount());
        list.deleteCity(city2);

    }




}
