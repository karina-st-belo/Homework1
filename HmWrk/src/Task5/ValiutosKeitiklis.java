package Task5;

import java.util.Scanner;

public class ValiutosKeitiklis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of Eur: ");
        int amountOfEuro = scanner.nextInt();
        double amountOfDollar = Math.round ( amountOfEuro* 1.06*100.0)/100.0;
        System.out.println("According to current euro exchange rate 1 EUR = 1.06 Dollar.");
        System.out.println("Your amount is eqaul:"+ amountOfDollar + "Dollar");
    }
}

