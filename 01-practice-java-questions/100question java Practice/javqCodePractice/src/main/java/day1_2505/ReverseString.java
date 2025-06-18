package day1_2505;

import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

//Reverse a string without using library functions
public class ReverseString {
    public static void main(String[] args) {
        String name = "Anand,Kumar,Mishra";
        String[] array = name.split(",");
        System.out.println(Arrays.toString(array));
        List<String> myList = new ArrayList<>();
        for (String ar : array) {
            myList.add(ar);
        }
        Collections.reverse(myList);
        System.out.println(myList);
        StringBuilder st = new StringBuilder();
        for (String list : myList) {
            st.append(list +",");

        }
        System.out.println(st);
    }
}
