class abcde {
    void eat() {
        System.out.println(" yo yo yo");
    }
}

class methodor extends abcde {
    public void eat() {
        System.out.println(" yo yo");
    }

    public static void main(String args[]) {
        methodor obj = new methodor();
        obj.eat();
    }
}