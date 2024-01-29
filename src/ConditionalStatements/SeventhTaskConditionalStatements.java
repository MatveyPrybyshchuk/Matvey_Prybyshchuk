package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
//нечетное
public class SeventhTaskConditionalStatements {
    public static void seventhTaskSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        try {
            double num = scanner.nextDouble();
            if (num%2 == 0) System.out.println("Число " + num + " четное");
            else System.out.println("Число " + num + " нечетное");
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }


    }
}
