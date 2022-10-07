import java.lang.*;

class factorial {
    public static void main(String args[]) {
        String m;
        int fact = 1, a;
        m = args[0];
        a = Integer.parseInt(m);
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(" the factorial is" + fact);
    }
}