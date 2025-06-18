package day1_2505;

public class FibonacciSeries {
    public static void main(String args[]) {
        int a, b, c;
        a = 0;
        b = 1;
        c = 0;
        System.out.print(a + " ");
        

        c = a + b;
        for (int i = 1; i < 100; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }


    }

}

