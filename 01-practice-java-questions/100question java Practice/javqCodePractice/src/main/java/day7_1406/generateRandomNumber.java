package day7_1406;

import java.util.Random;

public class generateRandomNumber {
    public static void main(String[] args) {
        Random ran=new Random();
        System.out.println(ran.nextInt(10000)+10000000);

    }
}
