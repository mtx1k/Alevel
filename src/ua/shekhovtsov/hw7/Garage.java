package ua.shekhovtsov.hw7;

public class Garage {
    public static void checkCar(Car car) {
        boolean checker = true;
        if (car.getPetrol() == 0) {
            System.out.println("Нет бензина!");
            checker = false;
        }
        if (car.getEngine().getPower() < 200) {
            System.out.println("Недостаточно мощности!");
            checker = false;
        }
        if(checker) {
            System.out.println("Всё в порядке!");
        }
    }
}
