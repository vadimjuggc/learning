package oop_principles_05.interfaces;

public class Runner {
    static void main() {
        Invoice invoice = new Invoice();
        Report report = new Report();

        invoice.printContent();
        invoice.printHeader();

        report.printContent();
        report.printHeader();
    }
}
