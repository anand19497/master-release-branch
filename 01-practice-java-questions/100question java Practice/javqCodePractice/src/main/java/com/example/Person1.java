package com.example;

public class Person1 {
    static final int univnumber = 482;
    public static int statiCount = 1;
    public int instancecount = 2;

    public static void running() {
        System.out.println("Static running " + statiCount);
    }

    public void eating() {
        //System.out.println("instans eating "+instancecount+ "Static count"+statiCount++);
        instancecount++;


        System.out.println("instans eating " + instancecount + " Static count" + statiCount++ + " univnumber " + univnumber);

    }

    public static void main(String[] args) {
        Person1 per1 = new Person1();
        System.out.println(per1.instancecount);
        System.out.println(Person1.statiCount);
        running();
        System.out.println();
        per1.eating();
        Person1 per2 = new Person1();
        per2.eating();
    }
}
