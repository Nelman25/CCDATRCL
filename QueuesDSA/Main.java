package QueuesDSA;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    
    //  Queue -> FIFO data structure. First In, First Out ( ex. a line of people )
    //           A collection designed for holding elements prior to processing 
    //           Linear data structure

    //           add = enqueue, offer()
    //           remove = dequeue, poll()

    Queue<String> queue = new LinkedList<String>();

    System.out.println(queue.isEmpty()); // checks if the queue is empty, returns a boolean value

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    System.out.println(queue.size()); // number of elements in the queue
    System.out.println(queue.contains("Harold")); // checks if the queue has certain value, this returns a boolean value

    // System.out.println(queue.peek()); // prints the first item in the queue (Karen)

    // queue.poll(); // dequeues Karen
    // queue.poll(); // dequeues Chad
    // queue.poll(); // dequeues Steve
    // queue.poll(); // dequeues Harold
    // queue.poll(); // currently, the queue is empty. But this poll() will not throw an exception. This will just print []
    // queue.element(); // this is the same as poll(), but this will throw an exception

    // Where are queues useful?

    // 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
    // 2. Printer Queue (Print jobs should be completed in order)
    // 3. Used in LinkedList, PriorityQueues, Breadth-first search

    System.out.println(queue);
  }
}
