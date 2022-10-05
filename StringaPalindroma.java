public class StringaPalindroma {

    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        boolean flag = true;
        String[] arrayString = s.split("");
        for (int i=0; i < arrayString.length; i++){
            String letter = arrayString[i];
            if (arrayString.length > 1){
                String lastCheck = arrayString[arrayString.length-i-1];
                if (letter == lastCheck){
                    flag = true;
                }else {
                    flag = false;
                }
            }
            }
        return true;
    }
}

