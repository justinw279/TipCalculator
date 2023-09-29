import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOfItems = new ArrayList<String>();
        ArrayList<Double> listOfPrices = new ArrayList<Double>();

        String item;
        double price = 0;

        System.out.println("Welcome to the tip calculator. ");
        System.out.print("How many people? ");
        int peopleInGroup = scan.nextInt();
        scan.nextLine();
        System.out.print("Tip percentage? (0-100) ");
        double tipPercentage = scan.nextDouble();
        scan.nextLine();

        double totalCost = 0;
        double totalBillBeforeTip = 0;
        double finalBill = 0;
        double totalTip = 0;
        double perPersonCostBeforeTip = 0;
        double tipPerPerson = 0;
        double totalCostPerPerson = 0;

        while (price != -1) {
            System.out.print("Enter a cost in dollars and cents, -1 to end: ");
            price = scan.nextDouble();
            if (price == -1) {
                break;
            }
            scan.nextLine();
            listOfPrices.add(price);
            System.out.print("Enter the item: ");
            item = scan.nextLine();
            listOfItems.add(item);
        }

        for(int i = 0; i < listOfPrices.size(); i++) {
            totalBillBeforeTip += listOfPrices.get(i);
        }
        totalBillBeforeTip = (double) Math.round(totalBillBeforeTip * 100) / 100;
        System.out.println("------------------------------\nTotal bill before tip: $" + totalBillBeforeTip);
        System.out.println("Tip percentage: $" + tipPercentage);
        totalTip = totalBillBeforeTip * (tipPercentage / 100);
        totalTip =  (double) Math.round(totalTip * 100) / 100;
        System.out.println("Total tip: $" + totalTip);
        totalCost = totalTip + totalBillBeforeTip;
        totalCost =  (double) Math.round(totalCost * 100) / 100;
        System.out.println("Total bill with tip: $" + totalCost);
        perPersonCostBeforeTip = totalBillBeforeTip / peopleInGroup;
        perPersonCostBeforeTip = Math.round(perPersonCostBeforeTip * 100) / 100.0;
        System.out.println("Per person cost before tip: $" + perPersonCostBeforeTip);
        tipPerPerson = totalTip / peopleInGroup;
        tipPerPerson =  (double) Math.round(tipPerPerson * 100) / 100;
        System.out.println("Tip per person: $" + tipPerPerson);
        totalCostPerPerson = totalCost / peopleInGroup;
        totalCostPerPerson =  (double) Math.round(totalCostPerPerson * 100) / 100;
        System.out.println("Total cost per person: $" + totalCostPerPerson + "\n------------------------------");
        System.out.println("Items ordered: ");
        for(int i = 0; i < listOfItems.size(); i++) {
            System.out.println(listOfItems.get(i) + ", costed $" + listOfPrices.get(i));
        }



    }


}