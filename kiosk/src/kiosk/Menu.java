package kiosk;

public class Menu {

    public String name;
    public double price;
    public String details;

    public Menu(String name, double price, String details) {
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public String toString() {
        return String.format("%-5s | W %.1f | 재료 : %s", name, price / 1000.0, details);
    }

}
