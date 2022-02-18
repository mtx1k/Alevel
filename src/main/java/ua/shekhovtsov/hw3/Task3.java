package ua.shekhovtsov.hw3;

 /*Количество слов в строке
 Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.
  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println(counterWords(text));
    }
    private static int counterWords(String text) {
        String[] strings = text.split("\\w+");
        return strings.length;
    }
}
