package functional_09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        int a = 1;
        while(a <= 10)
        {
            list.add(a);
            a++;
        }

        int sum = list.stream().filter(integer -> integer % 2 == 0).reduce(0, (integer, integer2) -> integer+integer2);
        System.out.println(sum);
        System.out.println();
        int max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println();
        list.stream().map(integer -> integer*2).forEach(System.out::println);
    }
}
