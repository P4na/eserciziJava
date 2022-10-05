import java.util.Arrays;
import java.util.Scanner;

public class DaDispariAPari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DA DISPARI A PARI\nquanti valori vuoi scrivere:");
        int turn = scanner.nextInt();
        int[] arrayValues = new int[turn];
        for (int i = 0; i < turn; i++) {
            System.out.println("scrivi valore "+(i+1));
            int number = scanner.nextInt();
            arrayValues[i] = number;
        }
        int[] copyArray = new int[turn];
        System.arraycopy(arrayValues, 0, copyArray,0, arrayValues.length);

        for (int i = 0; i < turn; i++) {
            if (copyArray[i] % 2 == 1){
                copyArray[i] *=2;
            }
        }
        System.out.println(Arrays.toString(arrayValues));
        System.out.println(Arrays.toString(copyArray));
    }

    /*
    Scrivete una funzione che dato un array di valori ne restituisce una copia dove i
    numeri dispari sono stati moltiplicati per 2.
     */
}
