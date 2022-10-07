

class check {
    static int x;
    int y;

    void display() {
        System.out.println(x);
        System.out.println(y);
        x++;
        y++;
    }
}

class static_variable {
    public static void main(String args[]) {
        check obj1 = new check();
        check obj2 = new check();
        obj1.display();
        obj2.display();
    }
}