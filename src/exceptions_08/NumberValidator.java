package exceptions_08;

public class NumberValidator {
    public static void main(String[] args) {
        try {
            checkNumber(-1);
        }
        catch (NegativeNumberException exception)
        {
            System.err.println(exception.getMessage());
        }

    }

    public static void checkNumber(int n) {
    if (n < 0)
        throw new NegativeNumberException("Negative number: " + n);
    }
}
