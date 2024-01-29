package Cycle;

import java.util.Scanner;

//Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
//индексом х
public class ThirdTaskCycle {
    public static void thirdTaskSolution () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        try {
            int num = scanner.nextInt();

            int[] array = new int[num + 1];
            array[0] = 0;
            if (array.length > 1) array[1] = 1;

            for (int i = 2; i < array.length; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println("Ваше число: " + array[num]);
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}
