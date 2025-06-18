package day6_1206;

public class ReverseInteger2 {
    public static void main(String[] args) {
        System.out.println("Reverse value is " + reversIntegerMethod(123456789));
    }

    private static int reversIntegerMethod(int i) {
//        123%10=3
//                12%10=2
//        123/10=12.3=12
//              1
//                      1%10=1
//                              1/10=0
        int number = 0;
        int j = String.valueOf(i).length();

        while (i > 0) {
            int temp = 0;
            temp = i % 10;
            number = number + (temp * (int) Math.pow(10, j - 1));

            i = i / 10;
            j--;
        }
        return number;

    }


}


