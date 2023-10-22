package kiosk.Burger;

import kiosk.Burger.Burger;

public class VeganBurger extends Burger {
	public VeganBurger () {
		super("비건버거", 3000, "콩고기 패티, 버섯, 양상추가 토핑된 비건버거");

		ingredient.push("콩고기 패티");
		ingredient.push("버섯");
		ingredient.push("양상추");
		ingredient.push("쉑소스");
	}
}
