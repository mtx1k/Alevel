package ua.shekhovtsov.homework2;

/*Создать метод и вызвать его в main():
    Метод будет выводить на экран меньшее по модулю из трёх переданных в метод вещественных чисел.
    Для вычисления модуля используйте тернарную операцию.
*/

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Task3.lessAbsNumber(-1.2, 1.3, -1.1));
    }
    public static double lessAbsNumber(double num1, double num2, double num3) {
        double absNum1 = (num1 >= 0 ? num1 : -num1);
        double absNum2 = (num2 >= 0 ? num2 : -num2);
        double absNum3 = (num3 >= 0 ? num3 : -num3);
        if (absNum1 < absNum2 && absNum1 < absNum3) {
            return num1;
        } else if (absNum2 < absNum1 && absNum2 < absNum3) {
            return num2;
        } else {
            return num3;
        }
    }
}