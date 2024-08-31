package LinkedListDSA;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {

  //  LinkedList => stores Nodes in 2 parts (data + address)
  //                Nodes are in non-consecutive memory locations
  //                Elements are linked using pointers

  //                  Singly Linked List
  //        Node                Node                Node
  //   [data | address] -> [data | address] -> [data | address]
  
  //                  Doubly Linked List
  //        Node                 Node                Node
  //   [data | address] <-> [data | address] <-> [data | address]

  //  ADVANTAGES?
  //  1. Dynamic Data Structure (allocates needed memory while running)
  //  2. Insertion and deletion of nodes is easy. O(1)
  //  3. No/Low memory waster

  //  DISADVANTAGES?
  //  1. Greater memory usage (additional pointer)
  //  2. No random access of elements (no index[i])
  //  3. Accessing/searching elements is more time consuming. o(n)
  
  //  USES?
  //  1. Implement Stack/Queues
  //  2. GPS Navigation
  //  3. Music playlist
  


  LinkedList<String> linkedList = new LinkedList<String>();

  // LinkedList as a Stack
  // linkedList.push("A");
  // linkedList.push("B");
  // linkedList.push("C");
  // linkedList.push("D");
  // linkedList.push("F");
  // linkedList.pop();

  // System.out.println(linkedList); // outputs => [F, D, C, B, A]. With pop(), => [D, C, B, A]

  // LinkedList as a Queue
  linkedList.offer("A");
  linkedList.offer("B");
  linkedList.offer("C");
  linkedList.offer("D");
  linkedList.offer("F");
  // linkedList.poll(); 

  linkedList.add(4, "E");
  System.out.println(linkedList); // outputs => [A, B, C, D, F]. With pop(), => [B, C, D, F]. after add(4, "E") => [A, B, C, D, E, F]

  linkedList.remove("E");
  System.out.println(linkedList); // outputs => [A, B, C, D, F]

  System.out.println(linkedList.peekFirst()); // outputs => A
  System.out.println(linkedList.peekLast()); // outputs => F

  linkedList.addFirst("0"); 
  System.out.println(linkedList); // outputs => [0, A, B, C, D, F]

  linkedList.addLast("G");
  System.out.println(linkedList); // outputs => [0, A, B, C, D, F, G]

  linkedList.removeFirst();
  System.out.println(linkedList); // outputs => [A, B, C, D, F, G]

  linkedList.removeLast();
  System.out.println(linkedList); // outputs => [A, B, C, D, F]
}
}
