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
        int tipPercentage = scan.nextInt();
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
            totalCost += listOfPrices.get(i);
        }
        
        System.out.print(totalCost);



    }


}