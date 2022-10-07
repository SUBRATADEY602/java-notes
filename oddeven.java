import java.io.*;
import java.lang.*;

class demo {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int n[] = new int[10];
    int i;

    void getdata() {
        System.out.println(" enter the 5 no ");
        for (i = 0; i < 5; i++) {
            try {
                n[i] = Integer.parseInt(in.readLine());
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    void cal() {
        System.out.println(" even no are");
        {
            for (i = 0; i < 5; i++) {
                if (n[i] % 2 == 0) {
                    System.out.println(n[i]);
                }
            }
        }
        System.out.println(" the odd no are");
        for (i = 0; i < 5; i++) {
            if (n[i] % 2 != 0)
                System.out.println(n[i]);
        }
    }
}

class oddeven {
    public static void main(String args[]) {
        demo obj = new demo();
        obj.getdata();
        obj.cal();
    }
}