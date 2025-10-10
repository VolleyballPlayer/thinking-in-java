package errorhandling;

class BaseballRuntimeException extends RuntimeException {}
class FoulRuntime extends BaseballRuntimeException {}
class StrikeRuntime extends BaseballRuntimeException {}

abstract class InningRuntime {
    public InningRuntime() {}
    public void event() {}
    public abstract void atBat();
    public void walk() {} // Throws no checked exceptions
}
class StormRuntimeException extends Exception {}
class RainedOutException extends StormRuntimeException {}
class PopFoulRuntime extends FoulRuntime {}

interface StormRuntime {
    public void event();
    public void rainHard();
}
public class Exercise29 extends InningRuntime implements StormRuntime {
    // OK to add new exceptions for constructors, but you
// must deal with the base constructor exceptions:
    public Exercise29(){}
    public Exercise29(String s){}
    public void rainHard(){}
// You can choose to not throw any exceptions,
    // even if the base version does:
    public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() {}
    public static void main(String[] args) {
        Exercise29 si = new Exercise29();
        si.atBat();

        InningRuntime i = new Exercise29();
        i.atBat();
    }
}
