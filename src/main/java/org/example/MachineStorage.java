package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class MachineStorage {
    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfBeans;
    private int disponsableCups;
    private int money;

    public MachineStorage() {
        this.amountOfWater = 400;
        this.amountOfMilk = 540;
        this.amountOfBeans = 120;
        this.disponsableCups = 9;
        this.money = 550;
    }

    public void getRemaining() {
        System.out.println("The coffee machine has:\n" +
                getAmountOfWater() + " ml of water\n" +
                getAmountOfMilk() + " ml of milk\n" +
                getAmountOfBeans() + " g of coffee beans\n" +
                getDisponsableCups() + " disposable cups\n" +
                getMoney() + " of money\n");
    }

    public void fill(int waterToAdd, int milkToAdd, int beansToAdd, int cupsToAdd) {
        addWater(waterToAdd);
        addMilk(milkToAdd);
        addBeans(beansToAdd);
        addCups(cupsToAdd);
    }

    public void takeMoney() {
        System.out.println("I gave you $" + getMoney() + "\n");
        setMoney(0);
    }

    public void addWater(int waterToAdd) {
        setAmountOfWater(getAmountOfWater() + waterToAdd);
    }

    public void addMilk(int milkToAdd) {
        setAmountOfMilk(getAmountOfMilk() + milkToAdd);
    }

    public void addBeans(int beansToAdd) {
        setAmountOfBeans(getAmountOfBeans() + beansToAdd);
    }

    public void addCups(int cupsToAdd) {
        setDisponsableCups(getDisponsableCups() + cupsToAdd);
    }

}
