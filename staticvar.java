class csa {
    int count = 0;

    void count_object() {
        count++;
    }

    void print() {
        System.out.println(count);
    }
}

public class staticvar {
    public static void main(String args[]) {
        csa obj1 = new csa();
        csa obj2 = new csa();
        csa obj3 = new csa();
        obj1.count_object();
        obj2.count_object();
        obj3.count_object();
        obj1.print();
    }
}