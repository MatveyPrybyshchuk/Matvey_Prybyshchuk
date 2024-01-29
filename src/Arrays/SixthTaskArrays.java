package Arrays;

//Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по
//диагонали от [0][0] до [10][10]
public class SixthTaskArrays {
    public static void sixthTaskSolution (Integer[][] array) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) System.out.println(array[i][j]);
            }
        }
    }
}
