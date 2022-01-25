package ua.shekhovtsov.classwork3;

//Task1

public class Task1 {
    public static void main(String[] args) {
        System.out.println(calc2(5.5));
        System.out.println(calc2(0));
        System.out.println(calc2(-13.2));
    }

    private static double calc(double x) {
        if (x <= 0) {
            return -x;
        }
        return x - 2;
    }

    private static double calc2(double x) {
        return x <= 0 ? -x : x - 2;
    }
}
