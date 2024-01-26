package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли два числа, выводим сообщение “первое число
//больше/меньше, чем второе” в зависимости от результата их сравнения
public class SecondTask {
    public static void secondTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1= scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2= scanner.nextInt();

        if (num1 < num2) System.out.println("Первое число меньше второго");
        else if (num1 > num2) System.out.println("Первое число больше второго");
        else System.out.println("Числа равны");
    }
}
