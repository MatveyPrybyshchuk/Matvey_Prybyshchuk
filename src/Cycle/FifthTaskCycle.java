package Cycle;

import java.util.Scanner;

//Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
//один символ)
public class FifthTaskCycle {
    public static void fifthTaskSolution () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        for (char ch: scanner.nextLine().toCharArray()) {
            System.out.println(ch);
        }
    }
}
