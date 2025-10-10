package errorhandling;
import java.io.*;

class FailingConstructor{
    private BufferedReader in;
    public FailingConstructor(String fname) throws FileNotFoundException {
        try {
            in = new BufferedReader(new FileReader(fname));
// Other code that might throw exceptions
        } catch(FileNotFoundException e) {
            System.out.println("File" + fname + " not found");
// Wasn’t open, so don’t close it
            throw e;

        }
    }
}
public class Exercise22 {
    public static void main(String[] args) throws FileNotFoundException{
        try{
            new FailingConstructor("filename.json");
        } catch(FileNotFoundException e){
            System.out.println("FileNotFound Exception caught");
        }
    }
}
