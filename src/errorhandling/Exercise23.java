package errorhandling;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
// Other code that might throw exceptions
        } catch(FileNotFoundException e) {
            System.out.println("Could not open " + fname);
// Wasn’t open, so don’t close it
            throw e;
        } catch(Exception e) {
// All other exceptions must close it
            try {
                in.close();
            } catch(IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e; // Rethrow
        } finally {
// Don’t close it here!!!
        }
    }
    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch(IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch(IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }
}

class FailingConstructor23{
    private InputFile obj;
    public FailingConstructor23(String fname) throws Exception {
        try {
            this.obj = new InputFile("filename.json");
// Other code that might throw exceptions
        } catch(Exception e) {
            System.out.println("Input file exception caught");
// Wasn’t open, so don’t close it
            new InputFile("filename.txt");

        }
    }
}
public class Exercise23 {
    public static void main(String[] args) throws Exception{
        try{
            new FailingConstructor23("filename.json");
        } catch(FileNotFoundException e){
            System.out.println("FileNotFound Exception caught");
        }
    }
}
