package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли два числа, выводим сообщение “первое число
//больше/меньше, чем второе” в зависимости от результата их сравнения
public class SecondTaskConditionalStatements {
    public static void secondTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое число:");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double num2 = scanner.nextDouble();

            if (num1 < num2) System.out.println("Первое число меньше, чем второе");
            else if (num1 > num2) System.out.println("Первое число больше, чем второе");
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}