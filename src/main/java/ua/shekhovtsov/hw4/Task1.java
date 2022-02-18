package ua.shekhovtsov.hw4;

import java.util.Arrays;
import java.util.Random;

/*
 1. Заполнить одномерный массив случайными целочисленными значениями.
Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива - 400 элементов.
   P.S. значения элементов можно ограничить значениями 1-10 включительно.
*/
public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[400];
        fillArrayRandomNumbers(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(getAverage(intArray));
        System.out.println(getGeometricAverage(intArray));
    }

    private static void fillArrayRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10);
        }
    }

    public static double getAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static double getGeometricAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        double result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        return Math.pow(result, 1.0 / array.length);
    }
}
