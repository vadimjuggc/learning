package collections_07.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountryRunner {
    public static void main(String[] args) {
        Country belarus = new Country("Belarus", "Minsk");
        Country poland = new Country("Poland", "Warsaw");
        Country norway = new Country("Norway", "Oslo");
        Country russia = new Country("Russia", "Moscow");
        Country ukraine = new Country("Ukraine", "Kiev");

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put(belarus.getName(), belarus.getCapital());
        map.put(poland.getName(), poland.getCapital());
        map.put(norway.getName(), norway.getCapital());
        map.put(russia.getName(), russia.getCapital());
        map.put(ukraine.getName(), ukraine.getCapital());

        System.out.println(map.containsKey("France"));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
