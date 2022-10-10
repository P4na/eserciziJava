import java.util.ArrayList;
import java.util.Random;

public class EstraiStringhe {

    public static String estrai(ArrayList<String> arr){
        Random random = new Random();
        int el = random.nextInt(arr.size());
        return arr.get(el);
    }
}
