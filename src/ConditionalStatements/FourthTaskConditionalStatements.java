package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
//количество отрицательных и положительных чисел
public class FourthTaskConditionalStatements {
    public static void fourthTaskSolution() {
        Scanner scanner = new Scanner(System.in);
        int counterForPos = 0, counterForNeg = 0;

        System.out.println("Введите последовательно 4 числа");
        try {
            for (int i = 0; i < 4; i++) {
                double num = scanner.nextDouble();
                if (num > 0) counterForPos++;
                else if (num < 0) counterForNeg++;
            }
            System.out.println("Количество положительных чисел: " + counterForPos);
            System.out.println("Количество отрицательных чисел: " + counterForNeg);
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}
