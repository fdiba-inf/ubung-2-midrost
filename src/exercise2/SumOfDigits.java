package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number between 0 and 999: ");
        int number = input.nextInt();

        int sum_digits = 0;
        while (number > 0){
            int digit = number % 10;
            sum_digits = sum_digits + digit;
            number = number / 10;
        }
        System.out.println("Sum of digits: " + sum_digits);
    }
}
