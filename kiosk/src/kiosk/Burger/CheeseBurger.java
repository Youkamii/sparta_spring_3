package kiosk.Burger;

import kiosk.Burger.Burger;

public class CheeseBurger extends Burger {

	public CheeseBurger () {
		super("치즈버거", 1000, "토마토, 양상추, 치즈가 토핑된 치즈버거");


		ingredient.push("토마토");
		ingredient.push("양상추");
		ingredient.push("치즈");
		ingredient.push("쉑소스");


	}
}
