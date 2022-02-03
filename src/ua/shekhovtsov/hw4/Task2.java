package ua.shekhovtsov.hw4;

import java.util.Arrays;
import java.util.Random;

/*
2. Заполнить одномерный массив случайными целочисленными значениями.
Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
*/
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[1000];
        fillArrayRandomNumbers(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(countPrimeNumbers(intArray));
    }

    private static void fillArrayRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10000);
        }
    }

    public static int countPrimeNumbers(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter++;
                continue;
            }
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    break;
                }
                if (j == array[i] - 1) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
