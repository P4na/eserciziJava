import java.util.ArrayList;
import java.util.Scanner;


//NON FINITO
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter index:");
        int index =scanner.nextInt();
        fibonacci(index);
    }

    static void fibonacci(int index) {
        long sum = 0;
        long secondSum = 1;
        long terzSum = 1;
        System.out.println(sum);
        System.out.println(secondSum);
        for (int i = 0; i < index; i++) {
            sum += secondSum; // 0 + 1 = 1
            System.out.println(sum);
            terzSum = sum;
            secondSum =+ sum; // secondSum = 1

        }
    }

}
