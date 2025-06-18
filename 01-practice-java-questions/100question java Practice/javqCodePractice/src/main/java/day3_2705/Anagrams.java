package day3_2705;

import java.util.Arrays;

public class Anagrams {
    public static boolean anagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);


    }


    public static void main(String[] args) {
        System.out.println(anagram("Lis ten", "Sile      nt"));

    }
}
