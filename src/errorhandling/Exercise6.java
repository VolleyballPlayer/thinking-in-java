package errorhandling;

import java.io.*;

import java.util.logging.Logger;

class LoggingException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException1");
    public LoggingException1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class LoggingExceptions2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (LoggingException1 e) {
            System.err.println("Caught " + e);
        }
        LoggingExceptions2 log2 = new LoggingExceptions2();
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            log2.logException(e);
        }
    }
}