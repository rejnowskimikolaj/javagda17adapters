package adapter.coffee;

import adapter.coffee.coffee_machine.CoffeeMachine;
import adapter.coffee.coffee_machine.CoffeeMachineAdapter;
import adapter.coffee.coffee_machine.CoffeeMachineInheritedAdapter;

public class Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        //niedozwolone!
       // kitchen.addDevice(new CoffeeMachine());

        kitchen.addDevice(new CoffeeMachineAdapter(new CoffeeMachine()));
        //lub:
        kitchen.addDevice(new CoffeeMachineInheritedAdapter());
        kitchen.turnEverythingOn();
    }
}
