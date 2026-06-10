package oop_principles_05.interfaces;

public class Report implements Printable{

    @Override
    public void printContent() {
        System.out.println("Sales report Q1");
    }

    @Override
    public void printHeader() {
        System.out.println("=== Report ===");
    }
}
