package day6_1206;

public class ReverseInteger1 {
    public static void main(String[] args) {
        System.out.println("Reverse value is " + reversIntegerMethod(51256789));
    }

    private static int reversIntegerMethod(int a) {

        // important  note: .reverse only applicable for String builder and buffer not fot string
        // String s= "Anand"  ->>>>  s.reverse will be wrong
        //but
//       StringBuilder s=new StringBuilder("Anand ") ;
//        System.out.println(s.reverse().toString());   ---->>>> so this is correct code
        return Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
    }
}
