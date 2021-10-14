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

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Many values");
            return;
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("No values");
            return;
        }

        if (a != 0) {
            double diskriminant = b ^ 2 - 4 * a * c;
            if (diskriminant < 0){
                System.out.println("Imaginary values");
                return;
            }

            double sqrt_dis = Math.sqrt(diskriminant);
            double x1 = (-b + sqrt_dis)/2*a;
            double x2 = (-b - sqrt_dis)/2*a;

            System.out.println(x1 + "\n" + x2);
        }

        if (a == 0 && b != 0){
            double res = -c/b;
            System.out.println(res);
        }
    }
}
