package ConditionalStatements;

import java.util.Scanner;

//Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//наибольшего и наименьшего из них
public class SixthTaskConditionalStatements {
    public static void sixthTaskSolution() {
        Scanner scanner = new Scanner(System.in);
        Double numMax = null, numMin = null;
        double[] array = new double[3];

        System.out.println("Введите последовательно 3 числа");
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextDouble();
            }
            for (int i = 0; i < array.length; i++) {
                if (numMax != null) {
                    if (array[i] > numMax) numMax = array[i];
                    else if (array[i] < numMin) numMin = array[i];
                } else {
                    numMax = array[i];
                    numMin = array[i];
                }
            }
            System.out.println("Сумма наибольшего и наименьшего числа: " + (numMax + numMin));
        } catch (Exception e) {
            System.out.println("Неверный ввод. Попробуйте еще раз");
        }
    }
}
