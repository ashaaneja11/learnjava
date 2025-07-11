public class MyClass {
  public static void main(String[] args) {
    
    // Create an array of size 30
    String[] studentNames = new String[30];

    // Add a few names
    studentNames[0] = "Rakesh";
    studentNames[1] = "Amit";
    studentNames[2] = "Sneha";

    // Print all non-null student names
    for (int i = 0; i < studentNames.length; i++) {
      if (studentNames[i] != null) {
        System.out.println("Student " + (i + 1) + ": " + studentNames[i]);
      }
    }
  }
}
