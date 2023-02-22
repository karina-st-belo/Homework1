import java.util.Scanner;

public class EdekaRewe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("is Edeka opne?");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.println("is Rewe open?");
        boolean isReweOpen = scanner.nextBoolean();
        System.out.println("Can buy food - " + canBuy (isEdekaOpen, isReweOpen));
    }
    public static boolean canBuy(boolean edekaIsOpen, boolean reweIsOpen){
        if (edekaIsOpen || reweIsOpen){
            return true;
        } else {
            return false;
        }
    }
}