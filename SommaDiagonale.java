import java.util.ArrayList;
import java.util.Scanner;

public class SommaDiagonale {
    public static void main(String[] args) {
        /*
        Inserisco Scanner
        Creo matrice
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci grandezza matrice");
        int matriceSize = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrice = new ArrayList<>();
        /*
        Creo for loop e inserisco gli elementi nella matrice
         */
        for (int i = 0; i < matriceSize; i++) {
            ArrayList<Integer> elementoMatrice = new ArrayList<>(matriceSize);
            for (int j = 0; j < matriceSize; j++) {
                System.out.println("Elemento "+(j+1) + " della matrice "+(i+1) );
                elementoMatrice.add(scanner.nextInt());
            }
            matrice.add(elementoMatrice);
        }
        StampaMatrice(matrice);
        System.out.println("adesso ti faccio la somma, sta a guarda:");
        EseguiSommaDiagonale(matrice, true);
    }

    public static void StampaMatrice(ArrayList<ArrayList<Integer>> matrice){
        for (int i = 0; i < matrice.size(); i++) {
            System.out.println(matrice.get(i).toString());
        }
    }

    public static void EseguiSommaDiagonale(ArrayList<ArrayList<Integer>> m, boolean reverse){
        int sum = 0;
        if (!reverse){
            for (int i = 0; i < m.size(); i++) {
                int val = m.get(i).get(i);
                sum += val;
            }
        }else{
            for (int i = 0; i < m.size(); i++) {
                int val = m.get((m.size()-1)-i).get((m.size()-1)-i);
                sum += val;
            }
        }
        System.out.println(sum);
    }
}
