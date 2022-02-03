package ua.shekhovtsov.hw5;

/*1.	Заполнение двумерного массива значениями индекса(от 1 и до кол-ва элементов в массиве),
при этом каждая вторая строка - отрицательными значениями.
Например
1 2 3
-4 -5 -6
7 8 9
-10 -11 -12
*Передать массив в метод, заполнить данный массив
Требования к задачам:
А) выведение массива в консоль до/после операций над массивом (если был пустой – не нужно)
Б) Все расчеты проводить в отдельных методах и возвращать значение, которое выводится в консоль в методе main().
В) Исходный массив не должен измениться, т.е. создаем копию и работаем с ней, если требуется изменение массива.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int rows, columns;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("rows");
        rows = Integer.parseInt(bufferedReader.readLine());
        System.out.println("columns");
        columns = Integer.parseInt(bufferedReader.readLine());
        int[][] array = new int[rows][columns];
        fill2dArray(array);
        if(array.length == 0) {
            System.out.println("length = 0");
            return;
        }
        System.out.println(Arrays.deepToString(array));
        print2dArray(array);
    }
    private static void fill2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j+i;
            }
        }
    }
    private static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
