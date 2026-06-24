package exceptions_08;

public class AgeParser {
    public static void main(String[] args) {
        try {
            readAge("132..a...");
        }
        catch (InvalidAgeException exception)
        {
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause());
        }
    }

    public static void readAge(String input) throws InvalidAgeException
    {
        try {
            Integer.parseInt(input);
        }
        catch (NumberFormatException exception)
        {
            throw new InvalidAgeException("Invalid input: " + input, exception);
        }
    }
}
