package other.practice1;

public class PracticeRunner1 {
    static void main(String[] args) {
        MathOperation add = (int a, int b) -> a+b;
        MathOperation complex = (int a, int b) -> a*b;
        MathOperation minus = (int a, int b) -> a-b;
        System.out.println(add.operate(1, 2));
        System.out.println(complex.operate(1, 2));
        System.out.println(minus.operate(1, 2));
    }
}
