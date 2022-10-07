import java.util.*;

public class series3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        int sums = 0;
        System.out.println(" enter the value of n");
        n = sc.nextInt();
        // System.out.println(" the series is....");
        // for (i = 1; i <= n; i++) {
        // System.out.print(2 * i);
        // }
        for (i = 0; i < n; i++) {
            sums = sums + i;
        }
        System.out.print(sums);

    }
}