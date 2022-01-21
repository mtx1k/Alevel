package edu.shekhovtsov.homework2;

/*  Создать метод и вызвать его в main():
    Заданы плоские декартовы координаты треугольника.
    Найти площадь треугольника.
    Метод должен вернуть значение площади.
*/

public class Task1 {
    public static double triangleAreaByCoordinate(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(((x1 - x3) * (y2 - y3)) - ((x2 - x3) * (y1 - y3)));
    }
}