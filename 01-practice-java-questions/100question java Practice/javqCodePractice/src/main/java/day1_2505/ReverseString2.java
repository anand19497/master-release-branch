package day1_2505;
import java.util.*;

public class ReverseString2 {
    public static void main(String[] args) {


        String name = "Anand";
        char[] charArray   = name.toCharArray();
        System.out.println(Arrays.toString(charArray));
        int left=0; int right=charArray.length-1;
        while(left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=charArray[left];
            left++;
            right--;

        }
        for (char c : charArray) {
            System.out.print(c);
        }

    }
}
