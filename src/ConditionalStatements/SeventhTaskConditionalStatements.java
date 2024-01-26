package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
//нечетное
public class SeventhTaskConditionalStatements {
    public static void seventhTaskSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        if (num%2 == 0) System.out.println("Число " + num + "четное");
        else System.out.println("Число " + num + "нечетное");
    }
}
