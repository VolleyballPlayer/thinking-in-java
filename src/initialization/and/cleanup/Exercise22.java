package initialization.and.cleanup;

public class Exercise22 {
    Currency currency;
    public Exercise22(Currency currency) { this.currency = currency; }
    public void describe(){
        System.out.print("This currency is ");
        switch (currency){
            case EUR: System.out.println("Euro");
            break;
            case RSD: System.out.println("Serbian Dinar");
            break;
            case USD: System.out.println("American Dolar");
            break;
            case GBP: System.out.println("British Pound");
            break;
            case PLN: System.out.println("Polish Zloty");
            break;
            case CZK: System.out.println("Czech Krone");
            break;
            default: System.out.println("not defined");
        }
    }
    public static void main(String[] args){
        Exercise22
                eur = new Exercise22(Currency.EUR),
                rsd = new Exercise22(Currency.RSD),
                usd = new Exercise22(Currency.USD),
                gbp = new Exercise22(Currency.GBP),
                pln = new Exercise22(Currency.PLN),
                czk = new Exercise22(Currency.CZK);
        eur.describe();
        rsd.describe();
        usd.describe();
        gbp.describe();
        pln.describe();
        czk.describe();
    }
}
