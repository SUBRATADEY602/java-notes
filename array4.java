import java.util.*;

class array4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        int counteven = 0, countodd = 0;
        System.out.println(" enter the the siz of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println(" enter the elements of the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }
        }
        System.out.println(" no of even number is=" + counteven);
        System.out.println(" no of odd number is=" + countodd);
    }
}