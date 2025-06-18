package day6_1206;

public class ReverseInteger4 {
    public static void main(String[] args) {
        System.out.println(reversIntegerMethod(12345678));

    }

    private static int reversIntegerMethod(int i) {
        int number = 0;
        while (i > 0) {
            int digit = i % 10;
            number = number * 10 + digit;
            i = i / 10;

        }
        return number;
    }
}
