package strings_04;

public class StartsEnds {
    static void main() {
        String value = "abc sdfsfsf abc";
        String word = "abc";
        if (StartsEnds(value, word))
            System.out.println("Строка начинается и заканчивается на " + word);
        else System.out.println("Строка не начинается и не заканчивается на " + word);

    }

    public static Boolean StartsEnds(String string, String word)
    {
        return (string.startsWith(word) && string.endsWith(word));
    }
}
