
class ab {
    int l, b;

    ab(int x, int y) {
        l = x;
        b = y;
    }

    void area() {
        System.out.println(" area is equal to:" + l * b);
    }
}

class cnstor1 {
    public static void main(String args[]) {
        ab r = new ab(2, 9);
        r.area();
    }
}
