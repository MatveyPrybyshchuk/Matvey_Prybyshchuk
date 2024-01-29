package Cycle;

import java.util.Scanner;

import static java.lang.Math.round;

//Пользователь вводит число. Выводим в консоль факториал этого числа
public class FourthTaskCycle {
    public static void fourthTaskSolution () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное натуральное число:");
        try {
            int num = scanner.nextInt();
            long result = 1;
            if (num >= 0) {
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
                System.out.println("Факториал числа " + num + " равен: " + result);
            } else System.out.println("Неверный ввод. Попробуйте еще раз");
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}
