package Task4;

import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        User userInput = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first positive integer number:");
        int a = userInput.firstNumber = scanner.nextInt();
        System.out.println("Please enter your second positive integer number:");
        int b = userInput.secondNumber = scanner.nextInt();
        Matematika Matematika = new Matematika();

        System.out.println("Here is the result of mathematical operations with the provided numbers");
        System.out.println("where " +a+ " is the first argument and " +b+ " is the second argument:");
        System.out.println("addition: " + Matematika.addition(a,b));
        System.out.println("substraction: " + Matematika.substraction (a,b));
        System.out.println("multiplication: " + Matematika.multiplication(a,b));
        System.out.println("division: " + Matematika.division(a,b));






    }
}