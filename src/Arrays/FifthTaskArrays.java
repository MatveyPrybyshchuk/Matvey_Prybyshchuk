package Arrays;

import java.util.*;

//Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
//таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
//соответствующее сообщение.
public class FifthTaskArrays {

    public static void fifthTaskSolution (Integer[] array) {
        ArrayList<Integer> maxed = new ArrayList<>(10);
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (Integer i : array) {
            if (mapa.get(i) != null) {
                Integer value = mapa.get(i);
                mapa.replace(i, ++value);
            }
            else mapa.put(i, 1);
        }
        var max = Collections.max(mapa.values());
        var keys = mapa.keySet();

        for (var el : keys) {
            if (Objects.equals(mapa.get(el), max)) maxed.add(el);
        }
        if (maxed.size() == array.length) System.out.println("Повторяющихся чисел нет!");
        else System.out.print("Наибольшее чаще встречаемое число: " + Collections.max(maxed));
    }
}
