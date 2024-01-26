package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
//сообщение, является ли треугольник равнобедренным, равносторонним или
//разносторонним.
public class ThirdTask {
    public static void  thirdTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первой стороны треугольника");
        int side1 = scanner.nextInt();
        System.out.println("Введите длину второй стороны треугольника");
        int side2 = scanner.nextInt();
        System.out.println("Введите длину третьей стороны треугольника");
        int side3 = scanner.nextInt();

        if (side1 == side2 || side1 == side3 || side2 == side3) System.out.println("Треугольник равнобедренный!");
        else if (side1 == side2 && side1== side3) System.out.println("Треугольник равносторонний!");
        else if (side1 <= 0 && side2 <= 0 && side3 <= 0) System.out.println("Такого треугольника не существует!");
        else System.out.println("Треугольник разносторонний!");
    }
}
