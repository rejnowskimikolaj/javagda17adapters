package adapter.coffee.coffee_machine;

import adapter.coffee.device.KitchenDevice;

public class CoffeeMachineAdapter implements KitchenDevice {
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineAdapter(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void turnDeviceOn() {
        coffeeMachine.on();
    }
}
