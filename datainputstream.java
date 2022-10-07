import java.lang.*;
import java.io.*;

class dataiostream {
    public static void main(String args[]) {
        try {
            int a, b, c;
            DataInputStream in = new DataInputStream(System.in);
            System.out.println("enter the two number");
            a = Integer.parseInt(in.readLine());
            b = Integer.parseInt(in.readLine());
            c = a + b;
            System.out.println(" sum is equal to:" + c);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}