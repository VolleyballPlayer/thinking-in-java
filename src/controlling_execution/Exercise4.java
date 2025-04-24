package controlling_execution;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Prime numbers (0-100) :");
        for(int i = 1; i < 100; i++ ) {
            int factors = 0;
            for(int j = 1; j < (i + 2)/2; j++ ) {
                if((i % j) == 0) factors++;
            }
            if(factors < 2)
                System.out.println(i);
        }
    }
}
