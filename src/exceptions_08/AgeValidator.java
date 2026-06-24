package exceptions_08;

public class AgeValidator {
    public static void main(String[] args) {
        try {
            validateAge(170);
        }
        catch (InvalidAgeException exception)
        {
            exception.printStackTrace();
        }
    }
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150)
            throw new InvalidAgeException("Invalid age: " + age);
    }
}
