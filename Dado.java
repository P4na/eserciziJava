import java.util.Random;
//  ESERCIZIO LANCIA DADO
public class Dado {

    public int lanciaDado(int nFacce){
        Random random = new Random();
        int randNum = random.nextInt(nFacce+1);
        while (randNum == 0){
            randNum = random.nextInt(nFacce+1);
        }
        return randNum;
    }
}
