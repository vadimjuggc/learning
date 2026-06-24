package exceptions_08;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(getElement(arr, 2));
        getElement(arr, 4);
    }

    public static int getElement(int[] array, int index)
    {
        try{
            return array[index];
        }
        catch (IndexOutOfBoundsException exception)
        {
            System.err.println("IndexOutOfBounds");
            return -1;
        }
    }
}
