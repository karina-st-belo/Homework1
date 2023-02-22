package Task2;

import java.util.Scanner;

public class Device {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature of first flask:");
        int temperatureOne = scanner.nextInt();
        System.out.println("Enter temperature of second flask:");
        int temperatureTwo = scanner.nextInt();
        System.out.println(checkValues(temperatureOne,temperatureTwo));
    }
    public static boolean checkValues(int temperatureOne,int temperatureTwo) {
    return temperatureOne > 100 && temperatureTwo< 100;
    }
}
