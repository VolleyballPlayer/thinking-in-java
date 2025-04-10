package objects;

public class Exercise7 {
    public static void main (String[] args){
        class Incrementable {
            static int i;
            static void increment() {
                i++;
                System.out.println(i);
            }
        }
        Incrementable.increment();
    }
}
