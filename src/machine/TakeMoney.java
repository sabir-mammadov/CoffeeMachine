package machine;

import static machine.CoffeeMachine.getMoney;
import static machine.CoffeeMachine.setMoney;

public class TakeMoney {
    public static void take() {
        System.out.println("I gave you $" + getMoney());
        setMoney(0);
    }
}
