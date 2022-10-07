class abc {
    int l, b;

    abc(int x, int y) {
        l = x;
        b = y;
    }

    abc(int p) {
        l = b = p;
    }

    void area() {
        System.out.println(" area is equal to:" + l * b);
    }
}

public class constructorol {
    public static void main(String args[]) {
        abc s = new abc(2);
        abc s1 = new abc(2, 4);
        s.area();
        s1.area();
    }
}
