package Arrays;

//Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
public class SecondTaskArrays {
    public static void secondTaskSolution (Integer[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
            i++;
        }
        System.out.println("Сумма элементов массива с четными индексами: " + result);
    }
}
