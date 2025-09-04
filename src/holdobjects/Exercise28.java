package holdobjects;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Exercise28 {
    public static void main(String[] args) {
        Queue<Double> q = new PriorityQueue<>();
        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            q.offer(rand.nextDouble());
        }
        while(q.peek() != null){
            System.out.println(q.poll() + " ");
        }
    }
}
