package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли три числа, выводим самое большое из них.
public class FifthTaskConditionalStatements {
    public static void fifthTaskSolution () {
        Scanner scanner = new Scanner(System.in);
        Double result = null;

        System.out.println("Введите последовательно 3 числа");
        try {
            for (int i = 0; i < 3; i++) {
                double num = scanner.nextDouble();
                if (result == null) result = num;
                else if (num > result) result = num;
            }
            System.out.println("Самое большое число: " + result);
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}
