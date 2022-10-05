public class HarmonicSum {
    public static void main(String[] args) {
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));
    }

    private static double harmonicSum(int n) {
        double initial = 0;
        for (int i = 1; i <= n; i++){
            initial += (1.00/i);
        }
        return initial;
    }
}
