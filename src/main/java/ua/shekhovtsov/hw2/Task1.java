package ua.shekhovtsov.hw2;

/*  Создать метод и вызвать его в main():
    Заданы плоские декартовы координаты треугольника.
    Найти площадь треугольника.
    Метод должен вернуть значение площади.
*/

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Task1.calcTriangleAreaByCoordinate(1, 3, 2, -5, -8, 4));
    }
    public static double calcTriangleAreaByCoordinate(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(((x1 - x3) * (y2 - y3)) - ((x2 - x3) * (y1 - y3)));
    }
}