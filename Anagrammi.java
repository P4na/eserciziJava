import java.util.*;

public class Anagrammi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        a.toLowerCase();
        b.toLowerCase();
        a.replaceAll("\\s", "");
        b.replaceAll("\\s", "");
        boolean isokay = true;
        ArrayList<String> aArrList= new ArrayList<String>(Arrays.asList(a.split("")));
        ArrayList<String> bArrList= new ArrayList<String>(Arrays.asList(b.split("")));
        if (aArrList.size() == bArrList.size()){
            Collections.sort(aArrList);
            Collections.sort(bArrList);
            for (int i = 0; i < aArrList.size(); i++) {
                if (!aArrList.get(i).equals(bArrList.get(i))){
                    isokay = false;
                    System.out.println(isokay);
                    return;
                }
            }
        }  else {
            isokay = false;
            System.out.println(isokay);
        }




        System.out.println(isokay);
    }
}