final class csa {
    void display() {
        System.out.parseInt(" base class");
    }
}

class tezz extends csa {
    void display() {
        System.out.println(" derived class");
    }
}

class final_class {
    public static void main(String args[]) {
        tezz obj1 = new tezz();
        obj1.display();
        obj1.display();
    }
}