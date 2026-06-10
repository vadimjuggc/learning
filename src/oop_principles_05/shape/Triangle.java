package oop_principles_05.shape;

public class Triangle extends Shape{

    private double a;
    private double h;

    @Override
    public double area() {
        return 0.5*a*h;
    }

    @Override
    public void PrintInfo() {
        System.out.println("a = " + a + " h = " + h + " area: " + area());
    }

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }
}
