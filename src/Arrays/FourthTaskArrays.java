package Arrays;

//Дан массив с целыми числами. Вывести в консоль наибольшее из них
public class FourthTaskArrays {
    public static void fourthTaskSolution (int[] array) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) result = array[i];
        }
        System.out.println("Наибольшее число в массиве: " + result);
    }
}
