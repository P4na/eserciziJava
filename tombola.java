import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tombola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hMatrix = 3;
        final int bMatrix = 5;
        ArrayList<Integer> WinnerNumbers = generateRandNumber(20);
        ArrayList<ArrayList<Integer>> matrix = generateMatrix(bMatrix, hMatrix);

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
        System.out.println(matrix.toString());
        return matrix;
    }

    public static void playGame(ArrayList<ArrayList<Integer>> Matrix, ArrayList<ArrayList<Integer>> WinnerNumbers){
        int ambo = 0;
        int terno = 0;
        int cinquina = 0;
        boolean tombola = false;
        }
}


/**
 * Creare il controllo per cinquina, terno e tutto il resto
 */