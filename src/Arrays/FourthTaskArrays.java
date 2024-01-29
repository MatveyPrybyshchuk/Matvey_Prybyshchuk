package Arrays;

//Дан массив с целыми числами. Вывести в консоль наибольшее из них
public class FourthTaskArrays {
    public static void fourthTaskSolution (Integer[] array) {
        int result = array[0];
        for (int el : array) {
            if (el > result) result = el;
        }
        System.out.println("Наибольшее число в массиве: " + result);
    }
}
