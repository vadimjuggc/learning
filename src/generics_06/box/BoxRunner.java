package generics_06.box;

public class BoxRunner {
    static void main() {
        Box<Integer> integerBox = new Box<>(2);
        Box<Number> numberBox = new Box<>(1);
        Box<Object> objectBox = new Box<>(3);
        integerBox.copyTo(numberBox);
        integerBox.copyTo(objectBox);

        System.out.println(integerBox.getData());
        System.out.println(numberBox.getData());
        System.out.println(objectBox.getData());
    }
}
