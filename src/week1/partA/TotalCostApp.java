package week1.partA;
/*A shopper wants to buy n items and wants to calculate the total cost of all items,
including tax. The tax rate is 8%. Write a Java program that calculates the total cost including
tax for n items, each costing £20.*/

public class TotalCostApp {
    public static void main(String[] args){
        double tax = 0.08;
        int price = 20;
        int items = 5;
        double totalCost = 0;

        double subTotal = price * items;
        double taxedPrice = subTotal * tax;

        double total = taxedPrice + subTotal;
        System.out.println("Price of items: " + subTotal);
        System.out.println("Taxes ammount: " + taxedPrice);
        System.out.println("Total price: " +total);
    }
}
