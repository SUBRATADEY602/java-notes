import java.util.*;

interface client {
    void input();

    void output();
}

class ankkit implements client {
    String name;
    double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the name");
        name = sc.nextLine();
        System.out.println(" please enter the salary");
        salary = sc.nextInt();
    }

    public void output() {
        System.out.println("NAME:" + name);
        System.out.println(" THE SALARY IS:" + salary);
    }

    public static void main(String args[]) {
        ankkit obj = new ankkit();
        obj.input();
        obj.output();
    }

}