import java.util.*;

class Task {
  String name;
  int priority;

  Task(String name, int priority) {
    this.name = name;
    this.priority = priority;
  }

  public String toString() {
    return name + " (Priority " + priority + ")";
  }
}

public class TaskQueue {
  public static void main(String[] args) {
    // Min-heap based on priority field
    PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));

    taskQueue.add(new Task("Email", 3));
    taskQueue.add(new Task("Bug Fix", 1));
    taskQueue.add(new Task("Meeting", 2));

    System.out.println("--- Tasks in order of priority ---");
    while (!taskQueue.isEmpty()) {
      System.out.println(taskQueue.poll());
    }
  }
}
