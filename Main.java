/*Write a simple program using Queue interface and add 6 integers and print them and remove 2 integral out of it, print the removed elements and existing elements (Queue) */

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    // Adds elements to the queue
    for (int i = 0; i < 6; i++)
      q.add(i);

    // Display contents of the queue.
    System.out.println("Elements of queue - " + q);

    // To remove the head of queue.
    int element1 = q.remove();
    System.out.println("removed element1 - " + element1);

    // To remove the head of queue.
    int element2 = q.remove();
    System.out.println("removed element2 - " + element2);

    // Display contents of the queue.
    System.out.println("Elements of queue after deletion operation - " + q);

  }
}
