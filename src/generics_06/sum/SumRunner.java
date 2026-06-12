package generics_06.sum;

import java.util.List;

import static generics_06.sum.Sum.sumAll;

public class SumRunner {
    static void main() {

        List<Integer> integerList = List.of(1, 3 ,4, 2);
        List<Double> doubleList = List.of(1.2 , 1.3, 1.4);
        List<Float> floatList = List.of(1.3f, 3.14f);

        System.out.println(sumAll(integerList));
        System.out.println(sumAll(doubleList));
        System.out.println(sumAll(floatList));
    }
}
