package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли три числа, выводим самое большое из них.
public class FifthTask {
    public static void fifthTaskSolution () {
        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[3];
        System.out.println("Введите последовательно 3 числа");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) result = nums[i];
        }
        System.out.println("Самое большое число: " + result);
    }
}
