package reusing.classes;

class Cleanser11 {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class Exercise11 {
    private String s = "DetergentWithDelegation";
    private Cleanser11 cleanser = new Cleanser11();

    public void append(String a){
        { s += a; }
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply(){
        cleanser.apply();
    }

    public void scrub(){
        append(" DetergentWithDelegation.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public String toString() { return s + " " + cleanser; }

    public static void main(String[] args) {
        Exercise11 obj = new Exercise11();
        obj.dilute();
        obj.apply();
        obj.scrub();
        obj.foam();
        System.out.println(obj);
    }
}
