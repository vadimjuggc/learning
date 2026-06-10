package oop_principles_05.interfaces;

public class Invoice implements Printable{

    @Override
    public void printContent() {
        System.out.println("=== Invoice ===");
    }
}
