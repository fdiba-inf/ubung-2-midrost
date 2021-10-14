package exercise2;

public class PiApproximation {
    public static void main(String[] args) {
        double pi = 4 * (1 - 1 / 3f + 1 / 5f - 1 / 7f + 1 / 11f - 1 / 13f + 1 / 17f - 1 / 19f + 1 / 23f);
        System.out.println("Pi: " + pi);
    }
}
