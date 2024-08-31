package PriorityQueueDSA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    // THIS ALSO WORK WITH ALPABHET, JUST CHANGE THE DATA TYPE TO <String>.
    // Queue<Double> queue = new LinkedList<Double>(); // standard order. outputs => [3.0, 2.5, 4.0, 1.5, 2.0]
    // Queue<Double> queue = new PriorityQueue<Double>(); // sorts the item to ascending order. Outputs => [1.5, 2.0, 2.5, 3.0, 4.0]
    Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder()); // with the comparator (Collections.reverseOrder), the output will be descending order => 4.0, 3.0, 2.5, 2.0, 1.5

    queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(4.0);
    queue.offer(1.5);
    queue.offer(2.0);

    // System.out.println(queue);

    while(!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
