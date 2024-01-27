package Arrays;

//Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
//значения)
public class ThirdTaskArrays {

    public static void thirdTaskSolution (int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) result += array[i];
        }
        System.out.println("Сумма четных элементов: " + result);
    }
}
