class student {
    public void methodstudent() {
        System.out.println(" the method of the class is invoked");
    }
}

class science extends student {
    public void methodscience() {
        System.out.println(" the method of the science class is invoked");
    }
}

class arts extends student {
    public void methodarts() {
        System.out.println(" the method of the arts class is invoked");
    }
}

class commerce extends student {
    public void methodcommerce() {
        System.out.println(" the method of the commerce class is invoked");
    }
}

public class hierachical {
    public static void main(String args[]) {
        science sci = new science();
        commerce com = new commerce();
        arts art = new arts();
        sci.methodscience();
        com.methodcommerce();
        art.methodarts();
    }
}
