import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinimoMassimo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        ArrayList<String> sArrList = new ArrayList<String>(Arrays.asList(s.split(",")));
        int [] arrayOfValues = new int[sArrList.size()];
        for (int i = 0; i < sArrList.size(); i++) {
            try
            {
                arrayOfValues[i] = Integer.parseInt(sArrList.get(i));
            }
            catch(Exception e) {
                System.out.println("Not an integer value");
            }
        }
        return arrayOfValues;
    }

    static void computeMinAndMax(int[] values) {
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values);
        }
    }
}