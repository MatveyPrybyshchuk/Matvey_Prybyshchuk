package Cycle;

import java.util.Scanner;

//Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
//индексом х
public class ThirdTaskCycle {
    public static void thirdTaskSolution () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();

        int nums[] = new int[3];
        nums[0] = 0;
        nums[1] = 1;
        int result = 0;


        if (num == 0) System.out.println("Ваше число: " + 0);
        else if (num == 1) System.out.println("Ваше число: " + 1);

        else {
            for (int i = 2; i < num; i++) {
                nums[2] = nums[0] + nums[1];
                nums[0] = nums[1];
                nums[1] = nums[2];
            }
            result = nums[1];
            System.out.println("Ваше число: " + result);
        }


    }
}
