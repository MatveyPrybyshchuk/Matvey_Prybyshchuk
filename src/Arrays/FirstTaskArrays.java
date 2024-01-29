package Arrays;

//Дан массив с целыми числами. Вывести в консоль количество положительных и
//отрицательных чисел в нем

import java.util.Scanner;

public class FirstTaskArrays {
    public static void fifthTaskSolution (int[] array) {
        int counterPos = 0, counterNeg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) counterPos++;
            else counterNeg++;
        }
        System.out.println("Количество положительных чисел в массиве: " + counterPos);
        System.out.println("Количество отрицательных чисел в массиве: " + counterNeg);
    }
}
