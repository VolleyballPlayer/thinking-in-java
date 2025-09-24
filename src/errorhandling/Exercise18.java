package errorhandling;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}
class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class ThirdException extends Exception{
    public String toString(){
        return "A third exception";
    }
}

class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void t() throws ThirdException{
        throw new ThirdException();
    }
}

public class Exercise18{
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                    lm.dispose();
                } finally {
                    lm.t();
                }
            } catch(Exception e){
                System.out.println(e);
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
