package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
//сообщение, является ли треугольник равнобедренным, равносторонним или
//разносторонним.
public class ThirdTaskConditionalStatements {
    public static void  thirdTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите последовательно длины сторон треугольника");
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            int side3 = scanner.nextInt();

            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
                if (side1 == side2 && side1 == side3) System.out.println("Треугольник равносторонник!");
                else if ((side1 == side3 && side1 == side2) || (side2 == side3 & side2 == side1) || (side3 == side1 && side3 == side2)) System.out.println("Треугольник равнобедренный!");
                else System.out.println("Треугольник разносторонний!");
            else
                System.out.println("Такого треугольника не существует!");
        } catch (Exception e) {
            System.out.println("Неверно введенные данные, попробуйте еще раз");
        }
    }
}