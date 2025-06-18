package day5_1106;

//check if number is Armstrong
public class Armstrong {
    public static void main(String[] args) {
        int[] arr = {153, 122, 1245, 232, 153};
        for (int j = 0; j < arr.length; j++) {
            int x = arr[j];


            if (isArmStrong(x)) {
                System.out.println(x + " is an armStrong");
            } else {
                System.out.println(x + " is not an armStrong");
            }
        }


    }

    public static boolean isArmStrong(int number) {
        int initialNumber = number;
        int sum = 0;

        int digitP = String.valueOf(initialNumber).length();
        while (number > 0) {
            int baseDigit = number % 10;
            sum = sum + (int) Math.pow(baseDigit, digitP);
            number = number / 10;
        }
        return initialNumber == sum;
    }
}
