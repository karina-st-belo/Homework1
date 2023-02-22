package Taks3;

import java.util.Scanner;

public class NewWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first word with even number of letters:");
        String firstWord = scanner.nextLine();
        String partOne = firstWord.substring(0, firstWord.length() / 2);
        System.out.println("Please enter second word with even number of letters:");
        String secondWord = scanner.nextLine();
        String partTwo = secondWord.substring(secondWord.length() / 2);
        System.out.println("Your new word is:" + partOne + partTwo);

    }
}
