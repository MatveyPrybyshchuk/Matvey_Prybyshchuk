package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли два числа, выводим сообщение “первое число
//больше/меньше, чем второе” в зависимости от результата их сравнения
public class SecondTaskConditionalStatements {
    public static void secondTaskSolution() {

        while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите последовательно 2 числа:");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    if (num1 < num2) {
                        System.out.println("Первое число меньше, чем второе");
                        break;
                    }
                    else if (num1 > num2) {
                        System.out.println("Первое число больше, чем второе");
                        break;
                    }
                    else {
                        System.out.println("Числа равны");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Неверный ввод. Необходимо ввести число!");
                }
            }
        }
    }