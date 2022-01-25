package ua.shekhovtsov.classwork3;

public class Task4 {
    public static void main(String[] args) {
        int number = 1003;
        oddAndEvenCounter(number);
        System.out.println(number);
    }
    private static void oddAndEvenCounterByString(int num) {
        int even = 0;
        int odd = 0;
        String temp = String.valueOf(num);
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even: " + even + ", odd: " + odd);
    }

    private static void oddAndEvenCounter(int num) {
        int even = 0;
        int odd = 0;
     //   int tempNum = num;
        while (num > 0) {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
         }
        System.out.println("even: " + even + ", odd: " + odd);
    }
}
