package collections_07.dmdevpracticecollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Polynomial {
    static void main() {
        HashMap<Integer, Integer> polynomial1 = new HashMap<>();
        HashMap<Integer, Integer> polynomial2 = new HashMap<>();
        polynomial1.put(1, 2);
        polynomial1.put(2, 4);
        polynomial1.put(4, 2);
        polynomial1.put(3, 1);
        polynomial2.put(2, 2);
        polynomial2.put(1, 1);
        polynomial2.put(4, 2);
        polynomial2.put(3, 1);
        printPolynomial(sum(polynomial1,polynomial2));
    }

    public static TreeMap<Integer, Integer> sum(HashMap<Integer, Integer> p1, HashMap<Integer, Integer> p2)
    {
        TreeMap<Integer, Integer> sum = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : p1.entrySet()) {
            sum.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : p2.entrySet()) {
            sum.put(entry.getKey(), sum.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return sum;
    }

    public static void printPolynomial(TreeMap<Integer, Integer> map)
    {
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()!=0) {
                if (!first) {
                    System.out.print(" + ");
                }
                System.out.print(entry.getValue() + "x^" + entry.getKey());
            }
            first = false;
        }
    }
}
