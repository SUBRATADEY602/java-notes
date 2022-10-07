class largecmdl {
    public static void main(String args[]) {
        String p, q, r;
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        if (x > y && x > z)
            System.out.println(" the largest no is" + x);
        else if (y > x && y > z)
            System.out.println(" the largest no is" + y);
        else if (z > x && z > y)
            System.out.println(" the largets no is" + z);
    }
}