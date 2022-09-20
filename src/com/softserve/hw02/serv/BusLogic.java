package com.softserve.hw02.serv;

import com.softserve.hw02.dao.In;
import com.softserve.hw02.dao.Out;

public class BusLogic {
    private Calc calc;
    private In myin;
    private Out myout;

    public BusLogic(In myin, Out myout) {
        this.myin = myin;
        this.myout = myout;
        calc = new Calc();
    }

    public int addInt() {
        int a = myin.readInt("a");
        int b = myin.readInt("b");
        //myin.close();
        int result = calc.add(a, b);
        myout.print(a + "+" + b + "= " + result);
        return result;
    }

    public float addFloat() {
        float a = myin.readFloat("float a = ");
        float b = myin.readInt("float b = ");
        //myin.close();
        float result = calc.add(a, b);
        myout.print(a + "+" + b + "= " + result);
        return result;
    }
}