package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner inputa = new Scanner(System.in);
        int a = inputa.nextInt();

        Scanner inputb = new Scanner(System.in);
        int b = inputb.nextInt();

        Scanner inputc = new Scanner(System.in);
        int c = inputc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Many values");
                } else {
                    System.out.println("No values");
                }
            } else {
                double res = (-c) / b;
                System.out.println(res);
            }
        } else {
            double diskriminant = (b * b) - 4 * a * c;
            if (diskriminant < 0) {
                System.out.println("Imaginary values");
                return;
            }

            double sqrt_dis = Math.sqrt(diskriminant);
            double x1 = (-b + sqrt_dis) / 2 * a;
            double x2 = (-b - sqrt_dis) / 2 * a;

            System.out.println(x1 + "\n" + x2);
        }
    }
}
