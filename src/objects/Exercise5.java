package objects;

class DataOnly {
    int i;
    double d;
    boolean b;
}

public class Exercise5 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 3;
        data.d = 2.71828;
        data.b = false;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}
