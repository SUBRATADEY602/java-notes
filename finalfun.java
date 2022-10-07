class abc {
    final void sum(
        {
            System.out.println(" hello csa");
        })
}

class finalfun extends abc {
    void run() {
        System.out.println(" good morning csa");
    }

    public static void main(String args[]) {
        finalfun obj = new finalfun();
        finalfun.run();
    }
}