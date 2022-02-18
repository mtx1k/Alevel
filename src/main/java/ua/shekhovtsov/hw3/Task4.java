package ua.shekhovtsov.hw3;

/*
Программа "Угадай число"
Задача
Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.

Решение
Описание переменных:

secret – число, "загаданное" компьютером;
guess – очередное число, вводимое пользователем.

Алгоритм решения задачи:

Программа генерирует псевдослучайное число, которое записывается в переменную secret.

Пока число secret не совпадет с числом guess, пользователю будет предлагаться ввести очередное число.
При этом, если guess > secret, то на экран будет выдаваться сообщение "Много". Иначе будет проверяться условие guess < secret.
При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int secret = new Random().nextInt(100 + 1);
        int guess = -1;
        do {
            guess = Integer.parseInt(reader.readLine());
            if(guess > secret) {
                System.out.println("Много");
            }
            else if(guess < secret) {
                System.out.println("Мало");
            } else {
                System.out.println("Угадал! " + secret);
                break;
            }
        } while (true);
    }
}
