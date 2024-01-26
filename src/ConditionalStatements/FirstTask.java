package ConditionalStatements;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

//Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//“Число больше десяти”, если меньше – “Число меньше десяти”
public class FirstTask {
    public static void firstTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = scanner.nextInt();
        if (num > 10) {
            System.out.println("Введенное число больше десяти");
        }
        else if (num < 10) {
            System.out.println("Введенное число меньше десяти");
        }
        else System.out.println("Введенное число равно десяти");
    }
}
