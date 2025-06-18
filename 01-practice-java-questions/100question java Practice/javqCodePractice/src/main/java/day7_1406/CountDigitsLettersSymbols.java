package day7_1406;

import java.util.Arrays;

public class CountDigitsLettersSymbols {

    public static void main(String[] args) {
        String st = "Anand 123@# drt24ee7669832eyt";
        int digitCount = 0;
        int letterCount = 0;
        int spaceCount = 0;
        int specialChar = 0;
        char[] charArrays = st.toCharArray();
        System.out.println(Arrays.toString(charArrays));
        for (char ch : charArrays) {
            if (!(Character.isDigit(ch) || Character.isLetter(ch) || Character.isSpaceChar(ch))) {

                specialChar++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            } else {
                spaceCount++;
            }

        }
        System.out.println("digitCount "+digitCount+" letterCount "+ letterCount+" spaceCount "+spaceCount+" specialChar "+specialChar);
    }
}
