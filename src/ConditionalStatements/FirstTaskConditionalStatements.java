package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//“Число больше десяти”, если меньше – “Число меньше десяти”
public class FirstTaskConditionalStatements {
    public static void firstTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число:");
            Double num = scanner.nextDouble();
            if (num > 10) System.out.println("Число больше десяти");
            else if (num < 10) System.out.println("Число меньше десяти");
        }
        catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}

