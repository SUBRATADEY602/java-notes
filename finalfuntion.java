class abc {
    final void run() {
        System.out.println(" hello csa");
    }
}

class finalfuntion extends abc {
    void run() {
        System.out.println(" good morning csa");
    }

    public static void main(String args[]) {
        finalfuntion obj = new finalfuntion();
        obj.run();
    }
}