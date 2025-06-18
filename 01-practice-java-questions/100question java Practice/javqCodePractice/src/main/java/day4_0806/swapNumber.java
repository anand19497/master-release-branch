package day4_0806;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//swap number without using temp
public class swapNumber {


    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        System.out.println("A " + a + " B " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A " + a + " B " + b);


        Integer[] arr = {22,12,15,23,29,1,7,45,6};
Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

    }}