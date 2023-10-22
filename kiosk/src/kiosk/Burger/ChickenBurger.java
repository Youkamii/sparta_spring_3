package kiosk.Burger;

import kiosk.Burger.Burger;

public class ChickenBurger extends Burger {
	public ChickenBurger () {
		super("치킨버거", 1500, "치킨, 양상추, 치즈가 토핑된 치킨버거");

		ingredient.push("치킨");
		ingredient.push("양상추");
		ingredient.push("치즈");
		ingredient.push("쉑소스");
	}
}
