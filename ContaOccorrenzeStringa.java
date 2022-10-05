import java.util.Scanner;

public class ContaOccorrenzeStringa {

    public static void main(String[] args) {
        int ripetition= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un carattere");
        String singleChar = scanner.nextLine();
        int longChar = singleChar.length();
        while(longChar > 1){
            System.out.println("troppo lungo, inserisci un carattere");
            singleChar = scanner.nextLine();
            longChar = singleChar.length();
        }
        System.out.println("inserisci una frase");
        String[] phrase = scanner.nextLine().split("");

        for (int i = 0; i < phrase.length; i++){
            if (singleChar.equals(phrase[i])){
                ripetition++;
            }
        }
        System.out.println("la frase contiene "+ ripetition + " "+ singleChar);
        }

}
