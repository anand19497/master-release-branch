package day3_2705;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find duplicate Character
public class DuplicateCharacters {


    public static List <Character> duplicate(String s){
         List<Character > chlist=new ArrayList<>();
      s= s.replaceAll("\\s","").toLowerCase();
      char [] charArrays=s.toCharArray();
        Arrays.sort(charArrays);
        for (int i=0;i<charArrays.length-1;i++)
            if (charArrays[i+1]==charArrays[i]&&!chlist.contains(charArrays[i])){
                chlist.add(charArrays[i]);
            }
        return chlist;
    }
    public static void main(String[] args) {
        String S="Anand";
        System.out.println(duplicate(S));

    }
}
