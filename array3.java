
// print the no of odd and even no
import java.util.*;

public class array3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n, e = 0, o = 0;
        System.out.println(" enter  no of the elements of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println(" please enter the element");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println(" no of the even no" + e);
        System.out.println(" no of the odd no" + o);
    }
}