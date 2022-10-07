import java.util.*;

public class test {
    public static void main(String args[]) {
        csa obj = new csa(3, 5);
        obj.area();
    }
}

class csa {
    int a, b;

    csa(int x, int y) {
        a = x;
        b = y;
    }

    void area() {
        System.out.println("area is :" + a * b);
    }
}
