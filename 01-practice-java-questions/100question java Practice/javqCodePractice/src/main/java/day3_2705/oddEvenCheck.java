package day3_2705;

import java.sql.SQLOutput;

public class oddEvenCheck {
    public static void oddEvenMethod(int number) {
        if ((number & 1) == 0) {
            System.out.println("even number ");
        } else {
            System.out.println("Odd number ");
        }

    }

    public static void main(String[] args) {
        oddEvenMethod(212);

    }
}
