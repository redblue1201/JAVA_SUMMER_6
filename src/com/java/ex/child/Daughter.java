package com.java.ex.child;

public class Daughter {
    private String name;
    private int age;
    public static int PapaMoney = 10000;

    public Daughter(String name, int age, int papaMoney) {
        this.name = name;
        this.age = age;
        // PapaMoney = papaMoney;
        System.out.println(this.name + "딸이 생성되었습니다.");
    }


    public int takeMoney(int money){
        PapaMoney = PapaMoney - money;
        return PapaMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
