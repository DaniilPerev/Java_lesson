package WaterMachine;

import java.util.Arrays;

public class WaterMachine {
    private double carbonatedWater = 10;
    private double syrup = 3;
    private int[] moneyReceiver = new int[100];
    private int freeCell = 0;

    public void removeMoney() {
        double sum = 0;
        for (int i = 0; i < freeCell; i++) {
            sum = sum + moneyReceiver[i];
            moneyReceiver[i] = 0;
        }
        System.out.println("Total money earned: " + sum / 100 + "$");
    }

    public void refuelDrink() {
        if (carbonatedWater == 10) {
            System.out.println("Carbonated Water is already full");
        } else {
            carbonatedWater = 10;
            System.out.println("Carbonated Water is refueled");
        }
        if (syrup == 3) {
            System.out.println("Syrup is already full");
        } else {
            syrup = 3;
            System.out.println("Syrop is refueled");
        }
    }

    public void drinkReceiver(int coin) {
        if (coin != 50 && coin != 25) {
            System.out.println("No drink, coin returned");
            return;

        }

        if (freeCell == -1) {
            System.out.println("Machine is full, coin returned");
            return;
        }
        if (coin == 25) {
            if (carbonatedWater < 0.2) {
                System.out.println("Carbonated Water is out of stock");
                return;
            } else {
                moneyReceiver[freeCell] = coin;
                carbonatedWater = carbonatedWater - 0.2;
                System.out.println("Carbonated Water is ready");
                freeCell++;
                //statistics();
            }
        }
        if (coin == 50) {
            if (syrup < 0.05 || carbonatedWater < 0.15) {
                System.out.println("Syrup is out of stock");
            } else {
                moneyReceiver[freeCell] = coin;
                syrup = syrup - 0.05;
                System.out.println("Carbonated Water with Syrup is ready");
                freeCell++;

                // statistics();
            }
        }

    }

    public void statistics() {
        for (int i = 0; i < freeCell; i++) {
            System.out.println(moneyReceiver[i] + " ");
        }
        System.out.println("Carbonated Water: " + carbonatedWater + " Syrup: " + syrup);
    }

}
