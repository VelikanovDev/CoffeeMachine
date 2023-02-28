package org.example;

import java.util.Scanner;

public class CoffeeMachine {
    MachineStorage storage = new MachineStorage();
    CoffeeMaker coffeeMaker = new CoffeeMaker(storage);
    Scanner scanner = new Scanner(System.in);
    boolean isActivated;

    public void launchMachine() {
        String action;
        isActivated = true;

        while (isActivated) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();

            switch (action) {
                case "buy" -> buyCoffee();
                case "fill" -> fillMachine();
                case "take" -> takeMoney();
                case "remaining" -> storage.getRemaining();
                case "exit" -> isActivated = false;
                default -> System.out.println("Wrong Input");
            }
        }
    }

    public void buyCoffee() {
        boolean inBuyMenu = true;
        String buyAction;
        while (inBuyMenu) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
             buyAction = scanner.next();

            switch (buyAction) {
                case "1" -> {
                    coffeeMaker.makeEspresso();
                    inBuyMenu = false;
                }
                case "2" -> {
                    coffeeMaker.makeLatte();
                    inBuyMenu = false;
                }
                case "3" -> {
                    coffeeMaker.makeCappuccino();
                    inBuyMenu = false;
                }
                case "back" -> inBuyMenu = false;
                case "exit" -> {
                    inBuyMenu = false;
                    isActivated = false;
                }
                default -> System.out.println("Wrong Input");
            }
        }

    }

    public void fillMachine() {
        System.out.println("Write how many ml of water you want to add: ");
        int waterToAdd = scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
        int milkToAdd = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        int beansToAdd = scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add: ");
        int cupsToAdd = scanner.nextInt();

        storage.fill(waterToAdd, milkToAdd, beansToAdd, cupsToAdd);
    }

    public void takeMoney() {
        storage.takeMoney();
    }
}
