class fibocmdl
{
    public static void main(String args[])
    {
        int a=0,b=1;
        int c,sum=0;
        int i; 
        String m;
        m= args[0];
        c=Integer.parseInt(m);
        System.out.println(a);
        System.out.println(b);
        for(i=3;i<=c;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
System.out.println(sum);
        }

    }
}
