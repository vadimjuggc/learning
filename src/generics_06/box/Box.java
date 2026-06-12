package generics_06.box;

public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public void copyTo(Box<? super T> destination)
    {
        destination.data = this.data;
    }

    public T getData() {
        return data;
    }
}
