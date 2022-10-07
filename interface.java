
interface printable {
    void print();
}

class one implements printable {
    public void print() {
        System.out.println(" helllo csa");
    }

    public static void main(String args[]) {
        one obj = new one();
        obj.print();
    }
}