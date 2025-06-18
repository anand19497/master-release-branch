package day7_1406;

import java.util.Arrays;

//Remove white spaces from a string
public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String st= "Anand Kumar Mishra";
      String [] fgfg=  st.split("//S");
        System.out.println(Arrays.toString(fgfg));
     st=   st.replace(" ","");
        System.out.println(st);

    }
}
