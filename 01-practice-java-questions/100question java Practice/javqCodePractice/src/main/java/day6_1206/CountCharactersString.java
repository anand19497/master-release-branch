package day6_1206;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersString {
    public static void main(String[] args) {
        String s = "banana";
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> it:map.entrySet() ){
            System.out.println(it.getKey() + " Value " +it.getValue());
        }
    }

}
