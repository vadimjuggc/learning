package generics_06.filter;

import java.util.Arrays;
import java.util.function.Predicate;

public class Filter<T> {
    static void main() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Filter<Integer> filter = new Filter<>();
        System.out.println(Arrays.toString(filter.filter(array, n -> n%2 == 0)));
        String[] stringArray = {"abc" , "sfa", "f", "fsadfs", "fasdf"};
        Filter<String> sFilter = new Filter<>();
        System.out.println(Arrays.toString(sFilter.filter(stringArray, n -> n.length()>2)));
    }
    public Object[] filter(T[] array, Predicate<T> predicate)
    {
        int counter = 0;
        for (T t : array) {
            if(predicate.test(t)) counter++;
        }
        Object[] filteredArray = new Object[counter];
        counter = 0;
        for (T t : array) {
            if (predicate.test(t))
            {
            filteredArray[counter] = t;
            counter++;
            }
        }
        return filteredArray;
    }
}
