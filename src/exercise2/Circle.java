package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + perimeter);
        System.out.println("Area: " + area);
    }
}
