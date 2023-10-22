package kiosk;

import com.sun.source.tree.BreakTree;
import kiosk.Burger.Burger;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Funtions {

    static Scanner scanner = new Scanner(System.in);


    public  static int checkInt() {
         String s;
         int i;

         while (true) {
             s = scanner.nextLine();
             try {
                 i = Integer.parseInt(s);
                 if (0 < i && i < 100) {
                     return i;
                 }
                 else
                     System.out.println("유효한 숫자를 입력해주세요.");
             } catch (NumberFormatException e) {
                 System.out.println("숫자만 입력해주세요.");
             }
         }
    }

    public static void showMenu() {

        Map<String, String> contents = new LinkedHashMap<String, String>();


        contents.put("Burgers", "앵거스 비프 통살을 다져만든 버거");
        contents.put("Drinks", "매장에서 직접 만드는 음료");


        int index = 1;

        System.out.println("[ SHAKESHACK MENU ]");

        for (Map.Entry<String, String> entry : contents.entrySet()) {
            System.out.printf("%d. %-10s | %s%n", index++, entry.getKey(), entry.getValue());
        }

        showOrder(index);
    }

    public  static void showOrder(int i) {
        Map<String, String> orders = new LinkedHashMap<String, String>();

        orders.put("Order", "장바구니를 확인 후 주문합니다.");
        orders.put("Cancel", "진행중인 주문을 취소합니다.");

        System.out.println('\n' + "[ ORDER MENU ]");

        for (Map.Entry<String, String> entry : orders.entrySet()) {
            System.out.printf("%d. %-10s | %s%n", i++, entry.getKey(), entry.getValue());
        }
    }

    public static int checkExit(int phaseControler) {
        int i;

        System.out.println("정말로 주문을 취소하시겠습니까?");
        System.out.println("장바구니가 초기화 됩니다.");
        System.out.printf("%s | %s", "1. 주문 취소하기", "2. 계속 주문하기" + '\n');

        i = checkInt();

        return switch (i) {
            case 1 -> 1;
            case 2 -> 2;
            default -> {
                System.out.println("올바른 숫자를 입력해주세요." + '\n');
                yield  checkExit(phaseControler);
            }
        };
    }

    //GPT
    public static void addCart(int next, List<Menu> cart, List<? extends Menu> availableItems) {
        if (next > 0 && next <= availableItems.size()) {
            Menu selectedItem = availableItems.get(next - 1);

            int yn = yesOrnoCart(next, availableItems);

            if (yn == 1) {
                cart.add(selectedItem);
                System.out.println(selectedItem.name + "가 장바구니에 추가되었습니다.");
            } else if (yn == 2) {
                System.out.println("취소되었습니다.");
            }
        } else {
            System.out.println("올바른 숫자를 입력해 주세요.");
        }
    }

    //GPT
    public static int yesOrnoCart (int next, List<? extends Menu> availableItems) {

        if (next > 0 && next <= availableItems.size()) {
            Menu selectedItem = availableItems.get(next - 1);
            System.out.printf("%-5s | W %-1.1f | 재료 : ", selectedItem.name, selectedItem.price / 1000);
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인   2. 취소");
            int i = checkInt();
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    System.out.println("올바른 숫자를 입력해주세요." + '\n');
                    return yesOrnoCart(next, availableItems);
            }
        } else {
            System.out.println("올바른 숫자를 입력해 주세요.");
            return -1;
        }

    }

    public static int orderFinal (int clientNum) {
        int i = Funtions.checkInt();

        switch (i){
            case 1 -> {
                System.out.println("주문이 완료되었습니다!");
                System.out.printf("대기번호는 [ %d ] 번 입니다.", clientNum);

                return 5;
            }
            case 2 -> {
                return 5;
            }
            default -> {
                System.out.println("올바른 숫자를 입력해 주세요.");
                return orderFinal(clientNum);
            }


        }
    }

//    public static int ordered(int phaseControler) {
//        int i;
//
//        System.out.println("정말로 주문을 취소하시겠습니까?");
//        System.out.println("장바구니가 초기화 됩니다.");
//        System.out.printf("%s | %s", "1. 주문 취소하기", "2. 계속 주문하기");
//
//        i = checkInt();
//
//        return switch (i) {
//            case 1 -> 4;
//            case 2 -> phaseControler;
//            default -> {
//                System.out.println("올바른 숫자를 입력해주세요." + '\n');
//                yield  checkExit(phaseControler);
//            }
//        };
//    }

}
