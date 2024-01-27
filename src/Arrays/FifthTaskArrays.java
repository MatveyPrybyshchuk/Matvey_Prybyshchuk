package Arrays;

import java.util.*;

//Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
//таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
//соответствующее сообщение.
public class FifthTaskArrays {

    public static void fifthTaskSolution (int[] array) {
        int intMax = array[0];
        int counterForMax = 0, MaxCounter = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) counter++;
                }

            MaxCounter = counter;
            if (counter > counterForMax) intMax = array[i];
            else if (counter == counterForMax) {
                if (array[i] > intMax) intMax = array[i];
            }
        }

        if (MaxCounter > 1) System.out.println("Наибольшее чаще встречаемое число: " + intMax);
        else System.out.println("Повторяющихся чисел нет!");
    }
}
