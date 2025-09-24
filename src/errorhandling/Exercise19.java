package errorhandling;

public class Exercise19{
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } finally {
                lm.dispose();
                lm.t();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

