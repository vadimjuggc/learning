package generics_06.stack;

public class Stack<T> {
    private Object[] stack;
    private int index;
    public Stack(int size) {
        stack = new Object[size];
        index = 0;
    }

    public void push(T element)
    {
        if(index< stack.length)
            stack[index++] = element;
        else
            System.out.println("stack is full");
    }

    public T pop()
    {
        if(!isEmpty()) {
            T item = (T) stack[index-1];
            stack[--index] = null;
            return item;
        }
        else {
            System.out.println("stack is empty");
            return null;
        }
    }

    public T peek()
    {
        if(!isEmpty()) {
            System.out.println("peek element: " + stack[index-1]);
            return (T) stack[index-1];
        }
        else {
            System.out.println("stack is empty");
            return null;
        }
    }

    public boolean isEmpty()
    {
        return index == 0;
    }
}
