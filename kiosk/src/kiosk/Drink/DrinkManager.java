package kiosk.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkManager {
	public static List<Drink> drinks = new ArrayList<>();

	static  { // 정적 초기화
		drinks.add(new CiderDrink());
		drinks.add(new CokeDrink());
		drinks.add(new CiderZeroDrink());
		drinks.add(new CokeZeroDrink());
	}

	public static List<Drink> getDrinks() {
		return drinks;
	}
}
