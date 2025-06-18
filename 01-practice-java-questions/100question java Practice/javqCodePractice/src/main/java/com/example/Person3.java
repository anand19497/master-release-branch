package com.example;

public class Person3 {
    public void eating() {
        System.out.println("i am eating");
    }
}

class Person4 extends Person3{
    @Override
    public void eating(){
        System.out.println("he is eating vegetable");
    }

}
class Person2{
    public static void main(String[] args) {

        Person3 p3=new Person3();
        p3.eating();
        Person3 p4=new Person4();
        p4.eating();


    }
}
