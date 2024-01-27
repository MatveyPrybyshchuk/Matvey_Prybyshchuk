package Arrays;

//Дан массив с целыми числами. Вывести в консоль количество положительных и
//отрицательных чисел в нем

import java.util.Scanner;

public class FirstTaskArrays {


    public static void fifthTaskSolution (int[] array) {
        int counterPos = 0, counterNeg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) counterPos++;
            else if (array[i] < 0) counterNeg++;
        }
        System.out.println("Количество положительных чисел: " + counterPos);
        System.out.println("Количество отрицательных чисел: " + counterNeg);

    }
}
