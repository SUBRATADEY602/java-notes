
// print the sum of even and odd seperatly
import java.util.*;

public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n, sume = 0, sumo = 0;
        System.out.println(" enter  no of the elements of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println(" please enter the element");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sume = sume + a[i];
            } else {
                sumo = sumo + a[i];
            }
        }
        System.out.println(" sum of the even no" + sume);
        System.out.println(" sum of the odd no" + sumo);
    }
}