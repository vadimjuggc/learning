package oop_principles_05.shape;

public class Rectangle extends Shape{

    private double a;
    private double b;

    @Override
    public double area() {
        return a*b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void PrintInfo() {
        System.out.println("a = " + a + " b = " + b + " area: " + area());
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
