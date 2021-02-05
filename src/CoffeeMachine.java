package machine;

import java.util.Scanner;

import static machine.FillCoffeeMachine.fill;
import static machine.PurchaseCoffee.buy;
import static machine.TakeMoney.take;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int disposableCups = 9;
    private static int money = 550;

    public static int getWater() {
        return water;
    }

    public static void setWater(int water) {
        CoffeeMachine.water = water;
    }

    public static int getMilk() {
        return milk;
    }

    public static void setMilk(int milk) {
        CoffeeMachine.milk = milk;
    }

    public static int getCoffeeBeans() {
        return coffeeBeans;
    }

    public static void setCoffeeBeans(int coffeeBeans) {
        CoffeeMachine.coffeeBeans = coffeeBeans;
    }

    public static int getDisposableCups() {
        return disposableCups;
    }

    public static void setDisposableCups(int disposableCups) {
        CoffeeMachine.disposableCups = disposableCups;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        CoffeeMachine.money = money;
    }

    public static void run() {

        while (true) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Choise choise = Choise.valueOf(getScanner().next().toUpperCase());
            switch (choise) {
                case BUY:
                    buy();
                    break;
                case FILL:
                    fill();
                    break;
                case TAKE:
                    take();
                    break;
                case REMAINING:
                    printState();
                    break;
                case EXIT:
                    System.exit(0);
            }
        }
    }

    private static void printState() {
        System.out.println();
        System.out.println("The coffe machine has:");
        System.out.println(water + " of water\n"
                + milk + " of milk\n"
                + coffeeBeans + " of coffee beans\n"
                + disposableCups + " of disposable cups\n"
                + money + " of money"
        );
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        CoffeeMachine.scanner = scanner;
    }

}
