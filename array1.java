import java.util.*;

public class array1 {
    public static void main(String args[]) { // addition of elements of array
        Scanner in = new Scanner(System.in);
        int i;
        int sum = 0;
        System.out.println(" enter the elements");
        int n = in.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum= " + sum);
    }
}
