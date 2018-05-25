package ru.geekbrains.hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {


//    1. Написать программу, которая загадывает случайное число от 0 до 9,
//    и пользователю дается 3 попытки угадать это число. При каждой попытке
//    компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
//    или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//    1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static  Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
       int flag=1;
       while(flag==1)
       {
           guessRandomNumber();
           System.out.println("Повторить игру еще раз? 1 - да/ 0 - нет");
           flag = scr.nextInt();
       }
    }

    public static void guessRandomNumber()
    {
        int n=10; //для диапазона чисел
        int i=3;//количество попыток
        int attempt;
        Random random = new Random();
        int number = random.nextInt(n);
        while (i>0)
        {
            System.out.println("Угадаваем число от 0 до 9");
            System.out.print("Введите ваш вариант:");
            attempt = scr.nextInt();
            if (attempt==number)
            {
                System.out.println("Вы победили!");
                break;
            } else if (attempt>number)
            {
                System.out.println("Загаданное число меньше");
            }else
            {
                System.out.println("Загаданное число больше");
            }
            if (i==1) {
                System.out.println("Вы проиграли!");
            }
            i--;
        }
    }


}
