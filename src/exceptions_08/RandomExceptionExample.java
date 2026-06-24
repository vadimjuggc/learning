package exceptions_08;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class RandomExceptionExample {

    public static void main(String[] args) {
        Random  random = new Random();
        try
        {
            randomException(random.nextInt(3));
        }
        catch (NullPointerException exception)
        {
            exception.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            exception.printStackTrace();
        }catch (ArithmeticException exception)
        {
            exception.printStackTrace();
        }
    }

    public static void randomException(int randomValue) {
        if (randomValue == 0) throw new ArithmeticException("arithmetic");
        if (randomValue == 1) throw new NullPointerException("null pointer");
        throw new ArrayIndexOutOfBoundsException("index out of bounds");
    }
}
