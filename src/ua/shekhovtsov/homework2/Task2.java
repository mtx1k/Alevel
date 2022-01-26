package ua.shekhovtsov.homework2;

/* Создать метод и вызвать его в main():
    метод будет сообщать(возвращать значение), является ли целое число, переданное в метод, чётным или нет.
*/

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Task2.oddOrNot(10) ? "Число четное" : "Число не четное");
    }
    public static boolean oddOrNot(int num) {
        return (num & 1) == 0;
    }
}
