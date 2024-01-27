package Arrays;

//Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по
//диагонали от [0][10] до [10][0]
public class SeventhTaskArrays {

    public static void seventhTaskSolution (int[][] array) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 9) System.out.println(array[i][j]);
            }
        }
    }
}
