package Cycle;

import java.util.Scanner;

//Пользователь вводит число. Выводим в консоль факториал этого числа
public class FourthTaskCycle {
    public static void fourthTaskSolution () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        long result = 1;

        if (num == 1) System.out.println("Ваше число: " + result);
        else {
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("Ваше число: " + result);
        }
    }
}
