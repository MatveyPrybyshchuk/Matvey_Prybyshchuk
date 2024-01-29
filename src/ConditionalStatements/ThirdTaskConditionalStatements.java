package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
//сообщение, является ли треугольник равнобедренным, равносторонним или
//разносторонним.
public class ThirdTaskConditionalStatements {
    public static void  thirdTaskSolution() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Последовательно введите длины трех сторон треугольника");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            if (doesTriangleExist(side1, side2, side3)) {
                if (isTriangleEquilateral(side1, side2, side3)) System.out.println("Треугольник равносторонний!");
                else if (isTriangleIsosceles(side1, side2, side3)) System.out.println("Треугольник равнобедренный!");
                else System.out.println("Треугольник разносторонний!");
            } else System.out.println("Такого треугольника не существует!");
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
    //Check is this triangular can exist
    public static boolean doesTriangleExist(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    //Check is this triangular equilateral
    public static boolean isTriangleEquilateral(double a, double b, double c) {
        return a == b && a == c;
    }
    //Check is this triangular isosceles
    public static boolean isTriangleIsosceles(double a, double b, double c) {
        return (a == b) || (a == c) || (b == c);
    }
}