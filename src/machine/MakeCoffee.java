package machine;

import machine.CoffeeMachine;
import machine.CoffeeType;

import static machine.CoffeeMachine.*;


public class MakeCoffee {


    public static void makeCoffee(CoffeeType type) {

        switch (type) {
            case ESPRESSO:
                if (getWater() >= 250 && getCoffeeBeans() >= 16 && getDisposableCups() > 0) {
                    setWater(getWater() - 250);
                    setCoffeeBeans(getCoffeeBeans() - 16);
                    setDisposableCups(getDisposableCups() - 1);
                    CoffeeMachine.setMoney(getMoney() + 4);
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (getWater() < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (getCoffeeBeans() < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (getDisposableCups() <= 0) {
                        System.out.println("Sorry, not enough cups!");
                    }
                }
                break;
            case LATTE:
                if (getWater() >= 350 && getMilk() >= 75 && getCoffeeBeans() >= 20 && getDisposableCups() > 0) {
                    setWater(getWater() - 350);
                    setMilk(getMilk() - 75);
                    setCoffeeBeans(getCoffeeBeans() - 20);
                    setDisposableCups(getDisposableCups() - 1);
                    setMoney(getMoney() + 7);

                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (getWater() < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if (getMilk() < 75) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (getCoffeeBeans() < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (getDisposableCups() <= 0) {
                        System.out.println("Sorry, not enough cups!");
                    }
                }
                break;
            case CAPPUCCINO:
                if (getWater() >= 200 && getMilk() >= 100 && getCoffeeBeans() >= 12 && getDisposableCups() > 0) {
                    setWater(getWater() - 200);
                    setMilk(getMilk() - 100);
                    setCoffeeBeans(getCoffeeBeans() - 12);
                    setDisposableCups(getDisposableCups() - 1);
                    setMoney(getMoney() + 6);

                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (getWater() < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else if (getMilk() < 100) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (getCoffeeBeans() < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (getDisposableCups() <= 0) {
                        System.out.println("Sorry, not enough cups!");
                    }
                }
                break;
        }
    }
}
