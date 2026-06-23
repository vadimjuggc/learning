package collections_07.treemap;

import java.util.Map;
import java.util.TreeMap;

public class WordRunner {
    public static void main(String[] args) {
        TreeMap<String, Integer> words = new TreeMap<>();
        Word apple = new Word("apple", 5);
        Word car = new Word("car", 3);
        Word house = new Word("house", 5);
        Word tree = new Word("tree", 4);
        Word milk = new Word("milk", 4);

        words.put(apple.getWord(), apple.getLetters());
        words.put(car.getWord(), car.getLetters());
        words.put(house.getWord(), house.getLetters());
        words.put(tree.getWord(), tree.getLetters());
        words.put(milk.getWord(), milk.getLetters());

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("word: " + entry.getKey() + ", letters: " + entry.getValue());
        }
        System.out.println();
        System.out.println(words.firstKey());
        System.out.println(words.lastKey());
    }
}
