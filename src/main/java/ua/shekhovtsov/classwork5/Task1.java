package ua.shekhovtsov.classwork5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) throws Exception {
        int[] prices = new int[12];
        fillRandomPrices(prices);
        System.out.println(Arrays.toString(prices));
        System.out.println(getSummaryPricesOver1000(prices));
    }

    private static void fillRandomPrices(int[] prices) throws Exception {
        checkNullArray(prices);
        Random random = new Random();
        for (int i = 0; i < prices.length; i++) {
            prices[i] = random.nextInt(3000);
        }
    }

    public static int getSummaryPricesOver1000(int[] prices) throws Exception {
        checkNullArray(prices);
        int summ = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 1000) {
                summ += prices[i];
            }
        }
        return summ;
    }

    private static void checkNullArray(int[] array) throws Exception {
        if(array.length == 0) {
            throw new Exception("Empty Array");
        }
    }
}
