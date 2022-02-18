package ua.shekhovtsov.classwork3;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(powNumber(2, 4));
    }

    private static int powNumber(int num, int pow) {
        int result = num;
        if (pow == 0) {
            return 1;
        }
        for (int i = 2; i <= pow; i++) {
            result *= num;
        }
        return result;
    }
}
