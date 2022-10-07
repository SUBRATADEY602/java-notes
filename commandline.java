import java.lang.*;

class commandline {
    public static void main(String args[]) {
        String a, b;
        int x, y, z;
        a = args[0];
        b = args[1];
        x = Integer.parseInt(a);
        y = Integer.parseInt(b);
        z = x + y;
        System.out.println(" sum= " + z);

    }
}