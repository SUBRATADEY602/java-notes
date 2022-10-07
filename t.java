class xyz {
    int count = 0;

    void count_obj() {
        count++;
    }

    void print() {
        System.out.println(count);
    }
}

public class t {
    public static void main(String arrgs[]) {
        xyz s = new xyz();
        xyz s1 = new xyz();
        xyz s2 = new xyz();
        s.count_obj();
        s1.count_obj();
        s2.count_obj();
        s.print();
    }
}