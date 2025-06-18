package day2_2605;
//Find the factorial of a number using recursion
public class Factorial {
    public static int factorial(int n){
        if (n<0) throw new IllegalArgumentException("negative  number is not correct for factorial");
        if (n==0||n==1) return 1;

        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(12));

    }

}
