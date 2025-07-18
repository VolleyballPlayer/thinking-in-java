package inner.classes;

public class Exercise8 {
    class Inner8{
        private int i;
        int print_inner(){
            return i;
        }
    }
    Inner8 inner = new Inner8();
    //inner.i;
    void show_outer(){
        System.out.println(inner);
    }
    void show_inner(){
        System.out.println(new Inner8().print_inner());
    }

    public static void main(String[] args) {
        Exercise8 obj = new Exercise8();
        //obj.i;
        obj.show_outer();
        obj.show_inner();
    }
}
