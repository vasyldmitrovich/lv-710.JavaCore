package com.softserve.hw05;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CarUtilTest {

    private final Car[] testCars = new Car[6];

    @Before
    public void initTestData(){
        testCars[0] = new Car("crossover", 2020, 2580);
        testCars[1] = new Car("hatchback", 2021, 2010);
        testCars[2] = new Car("cabriolet", 2014, 1590);
        testCars[3] = new Car("sedan", 2018, 1600);
        testCars[4] = new Car("sedan", 2009, 1600);
        testCars[5] = new Car("sedan", 1995, 2600);

    }

    @Test
    public void shouldFindCarByYear() {

        int testYear = 2014;
        Car expectedCar = testCars[2];
        Car result = CarUtil.findCarByYear(testYear, testCars);

        assertNotNull(result);
        assertEquals(result.getYearOfProduction(), testYear);
        assertEquals(result,  expectedCar);

    }

    @Test
    public void shouldNotFindCarByYear() {

        int testYear = 1987;
        Car result = CarUtil.findCarByYear(testYear, testCars);
        assertNull(result);

    }

    @After
    public void cleanData(){
        Arrays.fill(testCars, null);
    }

}