package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
//количество отрицательных и положительных чисел
public class FourthTaskConditionalStatements {
    public static void fourthTaskSolution() {
        Scanner scanner = new Scanner(System.in);
        int counterForPos = 0;
        int counterForNeg = 0;
        int nums[] = new int[4];

        System.out.println("Введите последовательно 4 числа");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) counterForPos++;
            else if (nums[i] < 0) counterForNeg++;
        }

        System.out.println("Количество положительных чисел: " + counterForPos);
        System.out.println("Количество отрицательных чисел: " + counterForNeg);
    }
}
