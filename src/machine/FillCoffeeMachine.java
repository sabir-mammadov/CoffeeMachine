package machine;

import static machine.CoffeeMachine.*;

public class FillCoffeeMachine {

    public static void fill() {

        System.out.println("Write how many ml of water do you want to add:");
        setWater(getScanner().nextInt());
        System.out.println("Write how many ml of milk do you want to add: ");
        setMilk(getScanner().nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        setCoffeeBeans(getScanner().nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        setDisposableCups(getScanner().nextInt());

    }
}
