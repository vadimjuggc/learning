package oop_principles_05.interfaces;

public interface Printable {

    void printContent();

    default void printHeader()
    {
        System.out.println("=== Document ===");
    }
}
