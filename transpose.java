import java.util.*;

public class transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println(" enter the rows of the matrix");
        int rows = sc.nextInt();
        System.out.println(" enter the columns of the matrix");
        int col = sc.nextInt();
        int a[][] = new int[rows][col];
        System.out.println(" enter the elemesnts of the array");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(" the matrix is......");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                System.out.println(a[i][j] + " ");
            }

        }
    }
}