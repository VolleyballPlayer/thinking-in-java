package controlling.execution;

import java.util.Random;
import java.util.Arrays;

public class Exercise2 {
    public static int[] get_random_array() {

        int n = 25;
        int[] arr = new int[n];

        // Create a Random object
        Random random = new Random();

        // Assign random values to the array
        for (int i = 0; i < n; i++) {

            // Generate a random integer
            // between INT_MIN and INT_MAX
            arr[i] = random.nextInt(25);
        }

        // Print the array
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] random_array = get_random_array();
        for (int i = 1; i < 25; i ++){
            int i1 = random_array[i - 1];
            int i2 = random_array[i];
            if (i1 > i2) {
                System.out.println( i1 + " greater than " + i2);
            }
            else if (i1 < i2) {
                System.out.println(i1 + " less than " + i2);
            }
            else {
                System.out.println(i1 + " equal to " + i2);
            }
        }
    }
}