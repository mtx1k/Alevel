package ua.shekhovtsov.hw5;

/*2.	Проверить, заданный массив на упорядоченность по невозрастанию,
 т. е. определить, верно ли, что каждый его элемент, начиная со второго, не больше предыдущего.
 *передать массив в метод, получить boolean*/

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        int[] newArray = sortAndReverseArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        System.out.println(isSortAndReverse(array) ? "упорядочен по невозрастанию" : "не упорядочен по невозрастанию");
        System.out.println(isSortAndReverse(newArray) ? "упорядочен по невозрастанию" : "не упорядочен по невозрастанию");

    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
    }

    private static int[] sortAndReverseArray(int[] array) {
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[temp.length - i - 1];
        }
        return result;
    }

    private static boolean isSortAndReverse(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
