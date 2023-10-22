package kiosk.Burger;

import java.util.ArrayList;
import java.util.List;

public class BurgerManager {
	public static List<Burger> burgers = new ArrayList<>();

	static  { // 정적 초기화
		burgers.add(new CheeseBurger());
		burgers.add(new ChickenBurger());
		burgers.add(new VeganBurger());
		burgers.add(new HanwooBurger());
	}

	public static List<Burger> getBurgers() {
		return burgers;
	}
}