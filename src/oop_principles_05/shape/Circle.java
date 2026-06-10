package oop_principles_05.shape;

public class Circle extends Shape{

    private double radius;

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void PrintInfo() {
        System.out.println("radius = " + radius + " area: " + area());
    }

    public double getRadius() {
        return radius;
    }
}
