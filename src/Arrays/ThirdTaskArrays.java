package Arrays;

//Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
//значения)
public class ThirdTaskArrays {
    public static void thirdTaskSolution (Integer[] array) {
        int result = 0;
        for (int el : array) {
            if (el % 2 == 0) result += el;
        }
        System.out.println("Сумма четных значений в массиве: " + result);
    }
}
