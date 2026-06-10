package oop_principles_05.shape;

public class Runner {
    static void main() {
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(6, 4);
        Shape rectangle = new Rectangle(5, 8);
        Shape[] shapes = {circle, triangle, rectangle};

        PrintInfo(shapes);
    }

    public static void PrintInfo(Shape[] shapes)
    {
        for (Shape shape : shapes) {
            shape.PrintInfo();
            System.out.println();
        }
    }
}
