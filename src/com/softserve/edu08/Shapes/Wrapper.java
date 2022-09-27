package com.softserve.edu08.Shapes;

public class Wrapper <T extends Shape>{
    private T t;

    public Wrapper(T t) {
        set(t);
    }

    private void set(T t){
        this.t = t;
    }
    private T get(){
        return t;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "t=" + t +
                '}';
    }
}
