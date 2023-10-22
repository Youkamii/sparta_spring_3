package kiosk.Burger;

import kiosk.Burger.Burger;

public class HanwooBurger extends Burger {
	public HanwooBurger () {
		super("한우버거", 2500, "국내산 한우, 토마토, 양상추가 토핑된 한우버거");

		ingredient.push("국내산 한우");
		ingredient.push("토마토");
		ingredient.push("양상추");
		ingredient.push("쉑소스");
	}
}
