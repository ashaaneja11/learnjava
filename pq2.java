import java.util.PriorityQueue;
import java.util.Collections;

public class MaxHeapExample {
  public static void main(String[] args) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    maxHeap.add(40);
    maxHeap.add(10);
    maxHeap.add(30);
    maxHeap.add(20);

    System.out.println("PriorityQueue (Max-Heap): " + maxHeap);

    System.out.println("--- Polling all elements (max to min) ---");
    while (!maxHeap.isEmpty()) {
      System.out.println(maxHeap.poll());
    }
  }
}
