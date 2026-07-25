package functional_09;

import java.util.ArrayList;
import java.util.List;

public class LambdaRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sdffg");
        list.add("nfgf");
        list.add("sdknf");
        list.add("nv");

        list.forEach(System.out::println);
        System.out.println();
        list.stream().filter(name -> name.length()>4).forEach(System.out::println);
        System.out.println();
        list.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
