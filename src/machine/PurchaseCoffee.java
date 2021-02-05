package machine;

import static machine.CoffeeMachine.getScanner;
import static machine.CoffeeType.*;
import static machine.MakeCoffee.makeCoffee;


public class PurchaseCoffee {

    public static void buy() {

        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String prompted = getScanner().next();

        switch (prompted) {
            case "1":
                makeCoffee(ESPRESSO);
                break;
            case "2":
                makeCoffee(LATTE);
                break;
            case "3":
                makeCoffee(CAPPUCCINO);
                break;
            case "back":
                break;
        }
    }
}
