class thisdemo {
    int a;

    thisdemo(int a) {
        this.a = a;
    }

    void show() {
        System.out.println(a);
    }

    public static void main(String args[]) {
        thisdemo r = new thisdemo(100);
        r.show();
    }
}