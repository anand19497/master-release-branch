package day4_0806;

import java.util.*;
import java.util.stream.Collectors;


//Find second largest Element in Arrays
public class secondLargestElement {
    public static void main(String[] args) {
//METHOD 1(nlogn,1)

        Integer[] arr = {22, 12, 15, 23, 29, 1, 7, 45, 6};
        System.out.println(secondElement(arr));
        //Integer[] arr = {22};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 2]);

        //Method 2 java 8 (n logn,1)
        List<Integer> list=Arrays.asList(arr);
        Integer in=list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("List sorting using java 8: "+in );

     //   Method 3 java 8 using comparator (mostly used highly recommended )((n logn,1)
        List<Integer> list1=Arrays.asList(arr);
     // Integer in1= list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       Optional<Integer> secondHighest=list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighest.ifPresent(value-> System.out.println("Final value is : "+value));
        secondHighest.ifPresentOrElse(value-> System.out.println("Final value is : "+value),()-> System.out.println("no value present"));
////Method 4 optimised approach


    }

    private static int secondElement(Integer[] arr) {
        //List<Integer> list = Arrays.asList(arr);
        Integer firstValue = null;
        Integer secondValue = null;
        for (Integer num : arr) {
            if (firstValue == null || num > firstValue) {
                secondValue = firstValue;
                firstValue = num;
            } else if (!firstValue.equals(num) && (secondValue == null || num > secondValue)) {
                secondValue = num;
            }
        }
        if (secondValue == null) {
            throw new RuntimeException("second value is null");
        }
        return secondValue;
    }

}
