package Cycle;

import java.util.Scanner;

//Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
public class SecondTaskCycle {
    public static void secondTaskSolution () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                if (i%2 == 0) System.out.println(i);
            }
        }
        else {
            for (int i = 0; i > num; i--) {
                if (i%2 == 0) System.out.println(i);
            }
        }
    }
}
