package Test2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int x = getIntX();
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {

        String numbToStr = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(numbToStr);
        String reversStr = stringBuilder.reverse().toString();

        return reversStr.equals(numbToStr);
    }

    static int getIntX() {

        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        while (!input.hasNextInt()) {
            System.out.println("Enter a number:  ");
            input.nextLine();
        }

        number = input.nextInt();
        input.close();

        return number;
    }


}
