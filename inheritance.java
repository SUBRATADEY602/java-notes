
class student {
    int rollno;

    void getno(int number) {
        rollno = number;
    }

    void putno() {
        System.out.println("registration no =" + rollno);
    }

}

class marks extends student {
    double marks;

    void getmarks(double m) {
        marks = m;
    }

    void putmarks() {
        System.out.println("marks=" + marks);
    }
}

class sports extends marks {
    double score;

    void getscore(double scr) {
        score = scr;
    }

    void putscore() {
        System.out.println(" score is =" + score);
    }
}

public class inheritance {
    public static void main(String args[]) {
        sports obj = new sports();
        obj.getno(987);
        obj.putno();
        obj.getmarks(89.0);
        obj.putmarks();
        obj.getscore(68);
        obj.putscore();

    }
}
