package generics_06.utils;

public class Utils {
    static void main(String[] args) {
        printMax(23, 23);
        printMax("banana", "apple");
        printMax(23.5, 26.4);
    }

    public static <T extends Comparable<T>> void printMax(T a, T b)
    {
        if(a.compareTo(b)>0) System.out.println(a);
        else if(a.compareTo(b)==0) System.out.println(a + " = " + b);
        else System.out.println(b);
    }
}
