package edu.shekhovtsov.homework2;

/* Создать метод и вызвать его в main():
    метод будет сообщать(возвращать значение), является ли целое число, переданное в метод, чётным или нет.
*/

public class Task2 {
    public static String oddOrNot(int num) {
        return ((num & 1) == 0 ? "Число четное" : "Число не четное");
    }
}
