package strings;
import java.util.regex.Pattern;

public class Exercise7 {
    public static void main(String[] args) {
        String pattern = "^\\p{Upper}.*\\.";
        boolean b_true = Pattern.matches(pattern, "This is a sentence.");
        System.out.println(b_true);
        boolean b_false = Pattern.matches(pattern, "This is not a sentence");
        System.out.println(b_false);
        boolean b_again_false = Pattern.matches(pattern, "this is not a sentence.");
        System.out.println(b_again_false);
    }
}
