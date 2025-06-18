package day2_2605;

import java.util.Arrays;

//Check if a string is a palindrome
public class Palindrome {
    public static void main(String[] args) {
        String name = "andna";
        char[] charArray = name.toCharArray();
       // System.out.println(charArray);
        int l = charArray.length;
        boolean isPalindrome =true;
        for (int i = 0; i < l / 2; i++) {

            if (charArray[i]!=charArray[l-1-i]){
                isPalindrome=false;
                break;

            }

        }
        if (isPalindrome){
            System.out.println("String is a palindrome");
        }else {

            System.out.println("String is  not a palindrome");
        }
    }
}

