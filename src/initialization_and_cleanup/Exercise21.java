package initialization_and_cleanup;

enum Currency{
    EUR, RSD, USD, GBP, PLN, CZK
}

public class Exercise21 {
    public static void main(String[] args){
        for (Currency c: Currency.values()){
            System.out.println(c + ", ordinal " + c.ordinal());
        }
    }
}
