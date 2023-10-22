package kiosk;

import kiosk.Burger.Burger;
import kiosk.Burger.BurgerManager;
import kiosk.Drink.Drink;
import kiosk.Drink.DrinkManager;

import java.util.List;

public class Phase {

    public static void highMenu () {
        System.out.println('\n' + "\u001B[32mSHAKESHAKE BURGER 에 오신걸 환영합니다. \u001B[0m");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요." + '\n');

        Funtions.showMenu();
    }

    public  static void burgersMenu () {

        int count = 1;

        System.out.println('\n' + "\u001B[32mSHAKESHAKE BURGER 에 오신걸 환영합니다. \u001B[0m");
        System.out.println("아래 버거 메뉴판을 보시고 상품을 골라 입력해주세요.." + '\n');

        System.out.println("[ Burgers MENU ]");
        for (Burger burger : BurgerManager.getBurgers()) {
            System.out.printf("%d. %-5s | W %-1s | %s%n", count++, burger.name, burger.price / 1000, burger.details);
        }

        Funtions.showOrder(count);

    }

    public  static void drinksMenu () {
        int count = 1;

        System.out.println('\n' + "\u001B[32mSHAKESHAKE BURGER 에 오신걸 환영합니다. \u001B[0m");
        System.out.println("아래 음료 메뉴판을 보시고 상품을 골라 입력해주세요." + '\n');

        System.out.println("[ Drinks MENU ]");
        for (Drink drink : DrinkManager.getDrinks()) {
            System.out.printf("%d. %-5s | W %-1s | %s%n", count++, drink.name, drink.price / 1000, drink.details);

        }
        Funtions.showOrder(count);
    }

    public  static void orderMenu (List<Menu> cart) {

        double total = 0;

        System.out.println('n' + "아래와 같이 주문 하시겠습니까?");

        System.out.println("[ Orders ]");

        for (Menu item : cart) {
            System.out.println(item);
        }

        System.out.println('\n' + "[ Total ]");

        for (Menu price : cart) {
            total += price.price;
        }
        System.out.println((int)total + " 원");

        System.out.println('\n' + "1. 주문   2. 추가주문");
    }


}
