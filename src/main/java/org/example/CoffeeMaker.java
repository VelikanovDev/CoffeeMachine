package org.example;

public class CoffeeMaker {
    private final MachineStorage storage;

    public CoffeeMaker(MachineStorage storage) {
        this.storage = storage;
    }

    public void makeEspresso() {
        if(checkResourcesForBeverage(250, 0, 16)) {
            storage.setAmountOfWater(storage.getAmountOfWater() - 250);
            storage.setAmountOfBeans(storage.getAmountOfBeans() - 16);
            storage.setMoney(storage.getMoney()  + 4);
            storage.setDisponsableCups(storage.getDisponsableCups() - 1);
        }

    }

    public void makeLatte() {
        if(checkResourcesForBeverage(350, 75, 20)) {
            storage.setAmountOfWater(storage.getAmountOfWater() - 350);
            storage.setAmountOfMilk(storage.getAmountOfMilk() - 75);
            storage.setAmountOfBeans(storage.getAmountOfBeans() - 20);
            storage.setMoney(storage.getMoney()  + 7);
            storage.setDisponsableCups(storage.getDisponsableCups() - 1);
        }

    }

    public void makeCappuccino() {
        if(checkResourcesForBeverage(200, 100, 12)) {
            storage.setAmountOfWater(storage.getAmountOfWater() - 200);
            storage.setAmountOfMilk(storage.getAmountOfMilk() - 100);
            storage.setAmountOfBeans(storage.getAmountOfBeans() - 12);
            storage.setMoney(storage.getMoney()  + 6);
            storage.setDisponsableCups(storage.getDisponsableCups() - 1);
        }

    }

    public boolean checkResourcesForBeverage(int water, int milk, int beans) {
        boolean isEnoughWater = storage.getAmountOfWater() >= water;
        boolean isEnoughMilk = storage.getAmountOfMilk() >= milk;
        boolean isEnoughBeans = storage.getAmountOfBeans() >= beans;
        boolean isEnoughCups = storage.getDisponsableCups() >= 1;

        if(!isEnoughWater) {
            System.out.println("Sorry, not enough water!\n");
            return false;
        }
        if(!isEnoughMilk) {
            System.out.println("Sorry, not enough milk!\n");
            return false;
        }
        if(!isEnoughBeans) {
            System.out.println("Sorry, not enough beans!\n");
            return false;
        }
        if(!isEnoughCups) {
            System.out.println("Sorry, not enough cups!\n");
            return false;
        }

        System.out.println("I have enough resources, making you a coffee!\n");
        return true;
    }
}
