package com.Ibnu.Modul2.Polimorfisme.Overriding;

public class DemoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
