package day1_2505;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            System.out.print( feboValue(i) + " ");
        }


    }
    public static int feboValue(int n){

        if (n==0)return 0;
        if (n==1)return 1;
        int x=feboValue(n-1)+feboValue(n-2);
        return x;
    }
}
