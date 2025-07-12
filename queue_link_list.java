import java.util.LinkedList;
import java.util.Queue;

public class MyQueueExample {
  public static void main(String[] args) {

    // ✅ Create a Queue using LinkedList
    Queue<String> queue = new LinkedList<>();

    // ✅ Add elements using add() and offer()
    queue.add("Amit");     // throws exception if fails
    queue.offer("Neha");   // returns false if fails
    queue.offer("Ravi");

    System.out.println("Initial Queue: " + queue);

    // ✅ Peek: view front element without removing
    String front = queue.peek(); // or queue.element()
    System.out.println("Front element (peek): " + front);

    // ✅ Remove elements using poll() and remove()
    String removed1 = queue.poll();   // returns null if empty
    System.out.println("Removed (poll): " + removed1);

    String removed2 = queue.remove(); // throws exception if empty
    System.out.println("Removed (remove): " + removed2);

    System.out.println("Queue after removals: " + queue);

    // ✅ Check if empty
    System.out.println("Is queue empty? " + queue.isEmpty());

    // ✅ Add more elements
    queue.add("Zara");
    queue.offer("John");

    System.out.println("Queue after adding more: " + queue);

    // ✅ Size
    System.out.println("Size of queue: " + queue.size());

    // ✅ Contains
    System.out.println("Contains 'Zara'? " + queue.contains("Zara"));
    System.out.println("Contains 'Amit'? " + queue.contains("Amit"));

    // ✅ Loop through queue using for-each
    System.out.println("\n--- Loop using for-each ---");
    for (String name : queue) {
      System.out.println(name);
    }

    // ✅ Clear the queue
    queue.clear();
    System.out.println("Queue after clear(): " + queue);
  }
}
