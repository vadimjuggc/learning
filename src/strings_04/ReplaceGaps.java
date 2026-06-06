package strings_04;

public class ReplaceGaps {
    static void main() {
        String value = "gfdhs :) )) (^.^) (: :( :(";
        System.out.println(value);
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value)
    {
        return value.replace(":(", ":)");
    }
}

