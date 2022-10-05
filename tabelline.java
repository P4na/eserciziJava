import java.util.Arrays;
import java.util.Scanner;

public class tabelline {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero per moltiplicare");
        int n = scanner.nextInt();
        System.out.println("lunghezza tabella");
        int m = scanner.nextInt();
        int[] tabella = new int[m];
        for (int i = 0; i < m; i++) {
            tabella[i] = i * n;
        }
        System.out.println(Arrays.toString(tabella));

    }

    /**
     * Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m
     * che in ogni cella ha il valore di indice della cella moltiplicato per n
     */
}
