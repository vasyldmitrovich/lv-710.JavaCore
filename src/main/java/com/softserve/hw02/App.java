package com.softserve.hw02;

import com.softserve.hw02.dao.In;
import com.softserve.hw02.dao.MyIn;
import com.softserve.hw02.dao.MyOut;
import com.softserve.hw02.serv.BusLogic;

public class App {

    public static void main(String[] args) {
        In myIn = new MyIn();
        new BusLogic(myIn, new MyOut()).addInt();
        new BusLogic(myIn, new MyOut()).addFloat();
        //new BusLogic(myIn, new MyOut()).addInt();
        myIn.close();
    }
}
