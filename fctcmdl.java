class fctcmdl
{
    public static void main(String args[])
{
    String m;
    int i,a;
     int fact=1;
    m = args[0];
    a = Integer.parseInt(m);
    for(i=1;i<=a;i++)
    {
        fact =fact*i;
    }
    System.out.println("the factorial of the number is"+fact);

}
}