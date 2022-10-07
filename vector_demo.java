import java.util.*;

public class vector_demo {
    public static void main(String args[]) {
        Vector v = new Vector();
        int x = 10;
        Integer y = new Integer(20);
        String str = "csa";
        v.add(x);
        v.add(y);
        v.add(str);
        v.add(2, new Integer(30));
        System.out.println(" the elements of vector :" + v);
        System.out.println(" size of the vector:" + v.size());
        System.out.println(" position in 2 element of vector is:" + v.elementAt(2));
        System.out.println(" the first element of vector is:" + v.firstElement());
        System.out.println(" the last element  of the vector is:" + v.lastElement());
        v.removeElementAt(2);
        System.out.println(" the elements of vector is:" + v);
    }
}
