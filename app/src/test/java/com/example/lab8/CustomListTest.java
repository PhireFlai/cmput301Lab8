package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {


    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    private City city;
    public City mockCity(){
        city = new City(null, null);
        return city;
    }


    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        city = mockCity();
        assertEquals(list.hasCity(), false);
        list.addCity(city);
        assertEquals(list.hasCity(), true);

    }

    @Test
    public void getCountTest(){
        list = MockCityList();
        assertEquals(list.getCount(), 0);
        city = mockCity();
        list.addCity(city);
        assertEquals(list.getCount(), 1);
    }

}
