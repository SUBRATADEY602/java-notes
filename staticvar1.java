class student {
    int roll;
    String name;
    static String cname = " apna college";

    student(int x, String y) {
        roll = x;
        name = y;
    }

    void display() {
        System.out.println(" Roll no =" + roll + " Name of student =" + name + " College name" + cname);
    }

    static void change() {
        cname = "  mera college";
    }
}

class staticvar1 {
    public static void main(String args[]) {
        student obj1 = new student(101, "rohit");
        student obj2 = new student(102, "mohit");
        obj1.display();
        obj2.display();
        student.change();
        obj1.display();
        obj2.display();
    }
}