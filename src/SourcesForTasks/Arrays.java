package SourcesForTasks;

public class Arrays {

    public static Integer[] oneMerArray () {
        //return new Integer[]{1, -3, -3, 4, 6, -5, 0, 1, 2, -3, 0};
        return new Integer[]{1, 2, 3, 4, 5, 5, 0, 0, 0};
    }
    public static Integer[][] twoMerArrayTen () {
        return new Integer[][] {
                {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 2},
                {2, 1, 3, 4, 5, 6, 7 ,8 ,2, 0},
                {3, 2, 1, 4, 5, 6, 7 ,2 ,9, 0},
                {4, 2, 3, 1, 5, 6, 2 ,8 ,9, 0},
                {5, 2, 3, 4, 1, 2, 7 ,8 ,9, 0},
                {6, 2, 3, 4, 2, 1, 7 ,8 ,9, 0},
                {7, 2, 3, 2, 5, 6, 1 ,8 ,9, 0},
                {8, 2, 2, 4, 5, 6, 7 ,1 ,9, 0},
                {9, 2, 3, 4, 5, 6, 7 ,8 ,1, 0},
                {2, 2, 3, 4, 5, 6, 7 ,8 ,9, 1}
        };
    }
    public static Integer[][] twoMerArrayFive () {
        return new Integer[][] {
                {6, 2, 3, 4, 5},
                {6, 2, 3, 4, 5},
                {6, 2, 3, 4, 5},
                {6, 2, 3, 4, 5},
                {6, 2, 3, 4, 5}
        };
    }
}
