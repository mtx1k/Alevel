package ua.shekhovtsov.hw3;

/*
 Удалить из строки пробелы и определить, является ли она перевертышем
 Считать строку из консоли. Передать в метод, который удалит из нее все пробелы.
 После этого определить, является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.
 */
/*
 Требования к задачам:
 Считывание данных проводить с консоли в методе main().
 Все расчеты проводить в отдельных методах и возвращать значение, которое выводится в консоль в методе main().

 Например, задание 2:
 Метод возвращает значение строки с удаленными пробелами, а другой метод определяет является ли строка палиндромом
 и возвращает boolean значение
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String result = deleteSpaces(text);
        System.out.println(result);
        System.out.println(isPalindrome(result) ? "Palindrome" : "Not Palindrome");
        reader.close();
    }
    private static String deleteSpaces(String text) {
        return text.replaceAll("\s", "");
    }
    private static boolean isPalindrome(String text) {
        return new StringBuffer(text).reverse().toString().toLowerCase().equals(text.toLowerCase());
    }
}
