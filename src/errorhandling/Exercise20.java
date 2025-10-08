package errorhandling;

import java.sql.SQLOutput;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}
class UmpireArgument extends Exception{}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class Exercise20 extends Inning implements Storm {
    public Exercise20()
            throws RainedOut, BaseballException {}
    public Exercise20(String s)
            throws Foul, BaseballException {}

    public void rainHard() throws RainedOut {}
    public void event() {}
    public void atBat() throws PopFoul {}
    public void newMethod() throws UmpireArgument {}
    public static void main(String[] args) {
        try {
            Exercise20 si = new Exercise20();
            si.atBat();
            si.newMethod();
        } catch (UmpireArgument e){
            System.out.println("Umpire");
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning i = new Exercise20();
            i.atBat();
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
