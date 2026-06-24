package exceptions_08;


public class FinallyExample {

    public static void main(String[] args) {
        try{
            riskyMethod();
        }
        catch (RuntimeException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Method completed");
        }
    }
    public static void riskyMethod()
    {
        if (Math.random() < 0.5)
            throw new RuntimeException("Something went wrong");
    }
}
