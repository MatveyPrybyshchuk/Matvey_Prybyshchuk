package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//наибольшего и наименьшего из них
public class SixthTaskConditionalStatements {
    public static void sixthTaskSolution() {
        Scanner scanner = new Scanner(System.in);
        int result;
        int nums[] = new int[3];

        System.out.println("Введите последовательно 3 числа");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int intMax = nums[0];
        int intMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) intMax = nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) intMin = nums[i];
        }

        result = intMax + intMin;
        System.out.println("Сумма наибольшего и наименьшего числа: " + result);
    }
}
