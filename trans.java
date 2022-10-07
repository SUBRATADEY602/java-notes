import java.util.*;

class trans {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int a[][] = new int[3][3];
        System.out.println(" enter the elements of the matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is");
        for (i = 0; i < 3; i++) {
            System.out.println();
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
        }
        System.out.println();
        System.out.println("the transpose of the matrix is");
        for (i = 0; i < 3; i++) {
            System.out.println();
            for (j = 0; j < 3; j++) {
                System.out.print(a[j][i]);

            }
        }
    }
}