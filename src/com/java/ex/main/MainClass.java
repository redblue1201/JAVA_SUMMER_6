package com.java.ex.main;

import com.java.ex.child.Daughter;

public class MainClass {
    public static void main(String[] args) {
        Daughter d1 = new Daughter("첫째",10,10000);
        Daughter d2 = new Daughter("둘째",10,10000);
        d1.takeMoney(5000);
        System.out.println(d1.getName() +"아빠의 돈: "+Daughter.PapaMoney);
        System.out.println(d2.getName() +"아빠의 돈: "+Daughter.PapaMoney);
    }
}
