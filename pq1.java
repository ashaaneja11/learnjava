import java.util.PriorityQueue;

public class MinHeapExample {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Add elements
    pq.add(40);
    pq.add(10);
    pq.add(30);
    pq.add(20);

    System.out.println("PriorityQueue (Min-Heap): " + pq);

    // Peek and poll
    System.out.println("Top element (peek): " + pq.peek());
    System.out.println("Removed element (poll): " + pq.poll());
    System.out.println("Queue after poll: " + pq);

    // Contains and size
    System.out.println("Contains 20? " + pq.contains(20));
    System.out.println("Size: " + pq.size());

    // Loop using while
    System.out.println("--- Polling all elements (min to max) ---");
    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }
  }
}
