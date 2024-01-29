package Arrays;

//Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и
//вывести наибольшую из них
public class EighthTaskArrays {
    public static void eighthTaskSolution (Integer[][] array) {
        int sumMax = 0;

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += array[j][i];
            }
            if (sum > sumMax) sumMax = sum;
        }
        System.out.println("Наибольшая сумма чисел по столбцам: " + sumMax);
    }
}
