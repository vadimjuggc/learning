package oop_principles_05.shape;

public class Runner {
    static void main() {
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(6, 4);
        Shape rectangle = new Rectangle(5, 8);
        Shape[] shapes = {circle, triangle, rectangle};

        PrintInfo(shapes);
        System.out.println();
        PrintDetails(shapes);
    }

    public static void PrintInfo(Shape[] shapes)
    {
        for (Shape shape : shapes) {
            shape.PrintInfo();
            System.out.println();
        }
    }

    public static void PrintDetails(Shape[] shapes)
    {
        for (Shape shape : shapes) {
            if (shape instanceof Circle circle) {
                System.out.println("radius: " + circle.getRadius());
            } else if (shape instanceof Triangle triangle) {
                System.out.println("a = " + triangle.getA() + " h = " + triangle.getH());
            }
            else if(shape instanceof Rectangle rectangle)
                System.out.println("a = " + rectangle.getA() + " b = " + rectangle.getB());
        }
    }
}
