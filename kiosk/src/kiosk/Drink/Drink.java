package kiosk.Drink;

import kiosk.Menu;

import java.util.List;

public class Drink extends Menu {

	public List<Drink> drinks;

	public Drink(String name, double price, String details) {
		super(name, price, details);
	}
}
