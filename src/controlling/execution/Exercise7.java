package controlling.execution;

public class Exercise7 {
    public static void get_int_with_break() {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) break;
            System.out.println(i);
        }
    }

    public static void get_int_with_return() {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) return;
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        System.out.println("Get integers until 98 with break");
        get_int_with_break();
        System.out.println("Get integers until 98 with return");
        get_int_with_return();
    }
}

