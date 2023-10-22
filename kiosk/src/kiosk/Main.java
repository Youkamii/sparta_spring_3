package kiosk;
import kiosk.Burger.Burger;
import kiosk.Burger.BurgerManager;
import kiosk.Drink.DrinkManager;

import java.util.ArrayList;



import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int clientNum = 1;

        int phaseController = 5;

        List<Menu> cart = new ArrayList<>();




        while (true) {

            int next;

            switch (phaseController) {
                case 5 :
                    Phase.highMenu();
                    phaseController = Funtions.checkInt();
                    break;
                case 1 :
                    Phase.burgersMenu();
                    next = Funtions.checkInt();
                    switch (next) {
                        case 1, 2, 3, 4 -> {
                            Funtions.addCart(next, cart, BurgerManager.getBurgers());
                            phaseController = 5;
                        }
                        case 5 -> Phase.orderMenu(cart);
                        case 6 -> phaseController = Funtions.checkExit(phaseController);
                        default -> System.out.println("올바른 숫자를 입력해주세요.");

                    }
                    break;
                case 2 :
                    Phase.drinksMenu();
                    next = Funtions.checkInt();
                    switch (next) {
                        case 1, 2, 3, 4 -> {
                            Funtions.addCart(next, cart, DrinkManager.getDrinks());
                            phaseController = 5;
                        }
                        case 5 -> Phase.orderMenu(cart);
                        case 6 -> phaseController = Funtions.checkExit(phaseController);
                        default -> System.out.println("올바른 숫자를 입력해주세요.");

                    }
                    break;
                case 3 :
                    Phase.orderMenu(cart);
                    phaseController = Funtions.orderFinal(clientNum++);
                    cart.clear();
                    break;
                case 4 :
                    int checkclear = Funtions.checkExit(phaseController);
                    if (checkclear == 1) {
                        System.out.println('\n' + "다음에 또 방문해주세요.");
                        cart.clear();
                    }
                    phaseController = 5;
                    break;
                default:
                    System.out.println("올바른 숫자를 입력해주세요.");
                    phaseController = 5;
                    break;
            }

        }

    }
}