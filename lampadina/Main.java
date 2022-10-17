package lampadina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampadina lampadina1 = new Lampadina();
        Interruttore interruttore1 = new Interruttore(lampadina1);
        Interruttore interruttore2 = new Interruttore(lampadina1);
        System.out.println("clicca qualcosa");
        String choice = "String";

        while (!choice.equals("N")){
            System.out.println("vuoi cliccare o uscire? S/N");
            choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (choice.equals("S")){
                System.out.println("Scegli interruttore, 1/2");
                choice = scanner.nextLine();
                if (choice.equals("1")){
                    interruttore1.click();
                } else if (choice.equals("2")){
                    interruttore2.click();
                }
            }
        }
        scanner.close();
    }
}
