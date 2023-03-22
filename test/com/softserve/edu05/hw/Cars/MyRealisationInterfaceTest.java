package com.softserve.edu05.hw.Cars;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyRealisationInterfaceTest {
    MyRealisationInterface m = new MyRealisationInterface();
    Car[] car = {
            new Car("Opel", 2010, 2.5),
            new Car("Fiat", 2005, 2),
            new Car("Jeep", 2006, 4)};
    Car[] car1 = {
            new Car("Fiat", 2005, 2),
            new Car("Jeep", 2006, 4),
            new Car("Opel", 2010, 2.5)};

    Car c = new Car();

    @Test
    public void testShowMessageAndReturnInputData() {
    }

    @Test
    public void testSortOfYear() {
      Car[]car2 =  m.sortOfYear(car);
        assertArrayEquals(car1, car2);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSearchOfYear() {
    }

    @Test
    public void testCreateCar() {
    }
}