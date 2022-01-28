package ua.shekhovtsov.homework4;

import java.util.Arrays;
import java.util.Random;

/*
4. Заполнить одномерный массив случайными целочисленными значениями.
Все четные значения заменить на нули. Размер массива - 2000 элементов.

Примечания:
Исходные массивы, которые передаются в метод не должны измениться.
Вычисления производить в отдельных методах.
*/
public class Task4 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        fillArrayRandomNumbers(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(replaceEvenNumbersByZero(intArray)));
        System.out.println(Arrays.toString(intArray));
    }

    private static void fillArrayRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10000);
        }
    }

    public static int[] replaceEvenNumbersByZero(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[i] = 0;
            }
        }
        return newArray;
    }
}
