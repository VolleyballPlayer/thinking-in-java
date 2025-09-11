package errorhandling;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LogException extends Exception{
    private static Logger logger = Logger.getLogger("LogException");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        try {
            System.out.println(myNum[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            new LogException().logException(e);
        }
    }
}