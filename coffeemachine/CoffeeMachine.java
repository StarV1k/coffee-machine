package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = sc.nextInt();

        int maxCupsFromWater = water / 200;
        int maxCupsFromMilk = milk / 50;
        int maxCupsFromCoffeeBeans = coffeeBeans / 15;
        int totalCups = maxCupsFromWater <= maxCupsFromMilk && maxCupsFromWater <= maxCupsFromCoffeeBeans
                ? maxCupsFromWater
                : maxCupsFromMilk <= maxCupsFromWater && maxCupsFromMilk <= maxCupsFromCoffeeBeans
                ? maxCupsFromMilk
                : maxCupsFromCoffeeBeans;

        if (cupsOfCoffee == totalCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsOfCoffee < totalCups) {
            System.out.println("Yes, I can make that amount of coffee (and even "
                    + (totalCups - cupsOfCoffee) + " more than that)");
        } else {
            System.out.println("No, I can make only " + totalCups + " cup(s) of coffee");
        }
    }
}
