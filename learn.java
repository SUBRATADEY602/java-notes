import java.util.*;

class learn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        // int sum = 0;
        System.out.println(" enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println(" enter the elements of the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(" the even nubers are");
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        System.out.println(" the odd numbers are...");
        for (i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

        }
        // System.out.println(" the elements are");
        // for (i = 0; i < n; i++) {
        // System.out.println(a[i]);
        // }
        // System.out.println(" the sum of all the elements are");
        // for (i = 0; i < n; i++) {
        // sum = sum + a[i];
        // }
        // System.out.println(sum);

    }
}
