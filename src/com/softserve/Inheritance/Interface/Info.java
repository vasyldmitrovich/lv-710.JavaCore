package com.softserve.Inheritance.Interface;

interface Info {
    void showInfo();
}
class TestInfo {
    public static void main(String[] args) {
        Info info = new Info() {
            @Override
            public void showInfo() {
                System.out.println("my info is my deal");
            }
        };
        info.showInfo();
    }
}
