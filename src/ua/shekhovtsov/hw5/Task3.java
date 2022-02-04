package ua.shekhovtsov.hw5;

/*3.	Дан двумерный массив NxN(количество строк = количество столбцов),
    написать программу которая поменяет местами столбцы и строки.
    Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
    Изначальный массив не должен измениться
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fill2dArray(array);
        System.out.println("default 2d array");
        print2dArray(array);
        System.out.println("Changing rows and columns");
        print2dArray(replaceRowsAndColumns(array));
        System.out.println("still default 2d array");
        print2dArray(array);
    }
    private static void fill2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + i * array[i].length + 1;
            }
        }
    }

    private static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    private static int[][] replaceRowsAndColumns(int[][] array){
        int[][] result = new int[array.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[array[i].length];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];
            }
        }
        return result;
    }
}
