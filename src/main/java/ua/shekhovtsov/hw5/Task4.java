package ua.shekhovtsov.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/*4.	Удаление из массива k-го элемента со сдвигом всех расположенных справа от него элементов на одну позицию влево.
  Необходимо создать новый массив, в котором удаляется элемент и вернуть его из метода.
  Изначальный массив не должен измениться
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] newArray = new int[array.length - 1];
        while (true) {
            System.out.println("Enter number < 10");
            int index = Integer.parseInt(reader.readLine());
            if(index < 10){
                newArray = deleteArrayElement(array, index);
                break;
            }
            System.out.println("Enter correct number!");
        }
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] deleteArrayElement(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < result.length; i++) {
            if(i<index) {
                result[i] = array[i];
                continue;
            }
            result[i] = array[i + 1];
        }
        return result;
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
    }
}
