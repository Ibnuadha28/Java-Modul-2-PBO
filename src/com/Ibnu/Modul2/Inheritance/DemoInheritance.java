package com.Ibnu.Modul2.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Masukan data ke SuperClass\t: ");
        superclass.x = 3;
        superclass.y = 4;
        superclass.printXY();

        System.out.println("Masukan data ke SubClass\t: ");
        subclass.x = 1;
        subclass.y = 2;
        subclass.printXY();

        subclass.z = 5;
        subclass.sumValue();
    }
}
