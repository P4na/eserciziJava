import java.util.ArrayList;
import java.util.Scanner;

public class SommaDiagonale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci grandezza matrice");
        int matriceSize = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrice = new ArrayList<>();
        for (int i = 0; i < matriceSize; i++) {
            ArrayList<Integer> elementoMatrice = new ArrayList<Integer>(matriceSize);
            for (int j = 0; j < matriceSize; j++) {
                System.out.println("Elemento "+(j+1) + " della matrice "+(i+1) );
                elementoMatrice.add(scanner.nextInt());
            }
            matrice.add(elementoMatrice);

        }
        StampaMatrice(matrice);
    }

    public static void StampaMatrice(ArrayList<ArrayList<Integer>> matrice){
        for (int i = 0; i < matrice.size(); i++) {
            System.out.println(matrice.get(i).toString());
        }
    }
}
