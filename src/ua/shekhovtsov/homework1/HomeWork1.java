package ua.shekhovtsov.homework1;

/*
Создать консольное приложение которое:
печатает ваше имя и фамилию
добавить условие, если длина вашего имени больше 7 символов - вывести в консоль “more than 7”, если меньше - ”less than 7”
задан шаг 0 - 10 и значение 5, вывести в консоль на каждом шагу информацию о шаге и о значении, с каждым шагом значение увеличивается на 2
Пример:
Шаг 0, значение 5
Шаг 1, значение 7
….
Шаг 10, значение 25
 */

public class HomeWork1 {
    public static void main(String[] args) {
        String firstName = "Vitalii";
        String lastName = "Shekhovtsov";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length() >= 7 ? "more then 7" : "less then 7");
        int number = 5;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Шаг " + i + ", значение " + number);
            number += 2;
        }
    }
}
