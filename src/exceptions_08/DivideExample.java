package exceptions_08;

public class DivideExample {
    static void main() {
        divide(2, 1);
        divide(1,0);
        divide(4, 2);
    }
    public static int divide(int a, int b)
    {
        try {
            return a/b;
        }
        catch (ArithmeticException exception)
        {
            System.out.println("division by zero");
            return 0;
        }
    }
}
