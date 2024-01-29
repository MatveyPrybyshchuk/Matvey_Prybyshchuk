package Cycle;

import java.util.*;

public class testmap {
    public static void method () {
        Integer[] array = {0, 1, 9, 9, 3, 4, 9, 9, 0, 0, 0};
        ArrayList<Integer> maxed = new ArrayList<Integer>(10);

        HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();

        for (Integer i : array)
        {
            if (mapa.get(i) != null)
            {
                Integer value = mapa.get(i);
                mapa.replace(i, ++value);
            }
            else
            {
                mapa.put(i, 1);
            }

        }
        System.out.println(mapa);

        System.out.println("\n" + Collections.max(mapa.values()));
        var max = Collections.max(mapa.values());

        var keys = mapa.keySet();

        for (var el : keys)
        {
            if (Objects.equals(mapa.get(el), max))
            {
                maxed.add(el);
            }
        }

        System.out.println(mapa);
        System.out.println(Collections.max(maxed));
    }
}
