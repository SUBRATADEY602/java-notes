import java.io.*;
import java.lang.*;

class buffread {
    public static void main(String args[]) throws IOException {
        int a, b, sum = 0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        // we can merge above two line in single line
        // !
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the two number");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        sum = a + b;
        System.out.println("addition is " + sum);
    }
}
