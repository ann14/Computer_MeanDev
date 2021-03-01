package com.company;

public class Main {

    public static void main(String[] args) {

        Normal  normal=new Normal(5,10);
        System.out.println("before");
        System.out.println(normal);

        double x[]=normal.generate(100);
        normal.computeMeanDev(x);
        System.out.println("after");
        System.out.println(normal);
    }
}
