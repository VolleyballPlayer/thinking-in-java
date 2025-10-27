package strings;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
Args used: "Java now has regular expressions" "^Java" "\Breg.*" "n.w\s+h(a|i)s" "s?" "s*" "s+" "s{4}" "s{1}." "s{0,3}"
*/

public class Exercise10 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage:\njava Exercise10 " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for(String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            if(!m.find())
                System.out.println("No match found for " + "\"" + arg + "\"");
            m.reset();
            while(m.find()) {
                System.out.println("Match \"" + m.group() + "\" at position " +
                        m.start() + ((m.end() - m.start() < 2) ? "" : ("-" + (m.end() - 1))));
            }
        }
    }
}