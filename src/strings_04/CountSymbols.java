package strings_04;

public class CountSymbols {
    static void main() {
        String value = "fs!!mmfsdf...//,,,,,,!!!";
        System.out.println();
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value)
    {
        String result = value.replace("!", "")
                .replace(",", "")
                .replace(".", "");
        System.out.println(result);
        return value.length()-result.length();
    }

}
