package ConditionalStatements;

import java.util.InputMismatchException;
import java.util.Scanner;

//Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//“Число больше десяти”, если меньше – “Число меньше десяти”
public class FirstTaskConditionalStatements {
    public static void firstTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число:");
            if (scanner.hasNext()) {
                String nextLine = scanner.next();
                Double num = null;
                try {
                    num = Double.valueOf(nextLine);
                } catch (Exception e) {
                    System.out.println("Неверный ввод. Необходимо ввести число!");
                }
                if (num != null) {
                    if (num > 10) System.out.println("Число больше десяти");
                    else if (num < 10) System.out.println("Число меньше десяти");
                }
            }
        }
    }
}

