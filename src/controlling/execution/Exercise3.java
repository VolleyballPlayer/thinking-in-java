package controlling.execution;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random rand = new Random(256);
        while(true){
            int j = rand.nextInt();
            int k = rand.nextInt();
            if(j < k)
                System.out.println("j = " + j + ", k = " + k + ", j < k");
            else if(j > k)
                System.out.println("j = " + j + ", k = " + k + ", j > k");
            else
                System.out.println("j = " + j + ", k = " + k + ", j = k");
        }
    }
}
