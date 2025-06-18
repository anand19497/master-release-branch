package day2_2605;

public class Palindrome1 {
    public static void main(String[] args) {
        String name = "MADAMA";
        int left = 0;
        int right = name.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {

            if (name.charAt(left) != name.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(name+" String is a palindrome");
        } else {

            System.out.println(name + " String is not a palindrome");
        }

    }
}
