package Arrays;

//Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и
//вывести наибольшую из них
public class EighthTaskArrays {

    public static void eighthTaskSolution (int[][] array) {
        Integer sumMax = null;


        for (int i = 0; i < 5; i++) {
            Integer sum = null;

            for (int j = 0; j < 5; j++) {
                if (sum == null) sum = array[j][i];
                    else sum += array[j][i];
            }
            if (sumMax == null) sumMax = sum;
            else if (sum > sumMax) sumMax = sum;
        }
        System.out.println("Наибольшая сумма чисел по столбцам: "+ sumMax);
    }
}
