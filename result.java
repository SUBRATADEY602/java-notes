class student {
    int roll, marks;

    void input(int x, int y) {
        roll = x;
        marks = y;
    }

    void print() {
        if (marks > 400) {
            System.out.println(" first div");
        } else if (marks > 300) {
            System.out.println(" 2nd division");
        } else if (marks > 200) {
            System.out.println(" 3rd div");
        } else if (marks < 200) {
            System.out.println(" fail");
        }
    }
}

class result {
    public static void main(String args[]) {
        student s = new student();
        student s1 = new student();
        student s2 = new student();
        s.input(16, 400);
        s1.input(43, 456);
        s2.input(48, 112);
        s.print();
        s1.print();
        s2.print();
    }
}