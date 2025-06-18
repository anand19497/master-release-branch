package day1_2505;
//Reverse the String
import java.util.Arrays;

public class ReverseString1 {
    public static void main(String[] args) {
        String name = "Anand";
        String[] nameArray = name.split("");
        String[] nameArray1 = new String[nameArray.length];
        //System.out.println(Arrays.toString(nameArray));
        for (int i = 0; i < nameArray.length; i++) {
            nameArray1[nameArray1.length - i - 1] = nameArray[i];
        }
        System.out.println(Arrays.toString(nameArray1));


        StringBuilder st = new StringBuilder();
        for (int j = 0; j < nameArray1.length; j++){
            st.append(nameArray1[j]);
        }

        System.out.println(st);



    }
}
