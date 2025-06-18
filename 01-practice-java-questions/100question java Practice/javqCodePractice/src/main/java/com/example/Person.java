package com.example;

public class Person {
    private String nam1;

    public Person(String x) {
        this.nam1 = x;
    }
    public void runname() {
        System.out.println("My name is " + nam1);
    }
    public  void eating (String nam1){
        System.out.println(nam1 +" is eating "+ this.nam1);
    }
    public static void sleeping(){
        System.out.println("is sleeping");
    }


    public static void main(String[] args) {
        // System.out.println(sum(3,2));
        Person p = new Person("Anand");
        p.runname();
        p.eating("prince");
        sleeping();
        p.sleeping();
    }
}
