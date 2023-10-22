package kiosk.Burger;

import kiosk.Menu;

import java.util.List;
import java.util.Stack;

public class Burger extends Menu {

	int num;

	public List<Burger> burgers;
	public Stack<String> ingredient = new Stack<>();

	public Burger(String name, double price, String details) {
		super(name, price, details);
	}

}


