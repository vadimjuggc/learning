package strings_04;

import java.util.Arrays;

public class Split {
    static void main() {
        String value = "abcabcabcabcabcabcabcabc";
        int n = 3;
        String[] result = SplitString(value, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] SplitString(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            String substring = value.substring(i, i + n);
            result[counter] = substring;
            counter++;
        }
        return result;
    }
}