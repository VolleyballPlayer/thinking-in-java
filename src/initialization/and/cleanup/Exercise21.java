package initialization.and.cleanup;

public class Exercise21 {
    public static void main(String[] args){
        for (Currency c: Currency.values()){
            System.out.println(c + ", ordinal " + c.ordinal());
        }
    }
}
