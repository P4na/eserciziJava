import java.util.ArrayList;
import java.util.Random;

public class tombola {
    public static void main(String[] args) {
        final int hMatrix = 3;
        final int bMatrix = 5;
        ArrayList<Integer> winnerNumbers = generateRandNumber(20);
        ArrayList<ArrayList<Integer>> matrix = generateMatrix(bMatrix, hMatrix);
        solution(matrix,winnerNumbers);
    }

    public static ArrayList<Integer> generateRandNumber(int limit){
        Random random = new Random();
        ArrayList<Integer> randNumbers = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            int value = random.nextInt(100);
            if (!randNumbers.contains(value)){
                randNumbers.add(value);
            } else {i--;}
        }
        return randNumbers;
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int b, int h){
        Random rand = new Random();
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        ArrayList<Integer> temporaryArray= new ArrayList<>();
        for (int i = 0; i < h; i++) {
            ArrayList<Integer> elMatrix = new ArrayList<>();
            for (int j = 0; j < b; j++) {
                int randNumber = rand.nextInt(100);
                while (randNumber == 0){
                    randNumber = rand.nextInt(100);
                }
                if (!temporaryArray.contains(randNumber)){
                    elMatrix.add(randNumber);
                    temporaryArray.add(randNumber);
                }else {
                    j--;
                }
            }
            matrix.add(elMatrix);
        }
        System.out.println(matrix);
        return matrix;
    }

    /** eseguo il confronto
     * ricevo come paramentri la matrice, e i numeri vincenti
     * si segnano i risultati quando, fine controllo su una riga contatore
     * utilizzo un contatore per riga e vedo quanti numeri fanno in base a questo do il valore finale
     */
    public static void solution(ArrayList<ArrayList<Integer>> matrix, ArrayList<Integer> winnerNumbers){
        int ambo = 0;
        int terno = 0;
        int quaterno = 0;
        int cinquina = 0;

        for (int i = 0; i < matrix.size(); i++) {
            int contatore = 0;
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (winnerNumbers.contains(matrix.get(i).get(j))){
                    System.out.println(matrix.get(i).get(j));
                    contatore++;
                }
            }
            switch (contatore){
                case 1:
                    break;
                case 2:
                    ambo++; break;
                case 3:
                    terno++; break;
                case 4:
                    quaterno++; break;
                case 5:
                    cinquina++; break;
            }
            if (cinquina == 3){
                System.out.println("Complimenti hai fatto tombola");
                return;
            }
        }
        System.out.println("winner number:" + winnerNumbers);
        System.out.println("risultati\nambo:"+ ambo +" terno:" + terno + " quaterno:"+ quaterno +" cinquina: "+ cinquina);
        }
}


