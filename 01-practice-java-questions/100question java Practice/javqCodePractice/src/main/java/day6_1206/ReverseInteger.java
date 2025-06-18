package day6_1206;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println("Reverse value is " + reversIntegerMethod(51256789));
    }

    private static int reversIntegerMethod(int a) {
        String st = String.valueOf(a);
        char[] charArray = st.toCharArray();
        Character[] charArray1 = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {

            charArray1[i] = charArray[i];
        }

        List<Character> list = Arrays.asList(charArray1);
        Collections.reverse(list);
          StringBuilder stb=new StringBuilder();
        for (Character c1 : list) {
            stb.append(c1);
        }

        // System.out.println(Stb);
        return Integer.valueOf(stb.toString());

    }
}
