public class StringCompare {


  public static void main(String[] args) {

    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");
    String s4 = s3;

    // == - Compare the Object Reference
    // equals - Compares the contents of two objects to determine


    System.out.println(s1 == s2); // true
    System.out.println(s1 == s3); // false
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // true
    System.out.println(s3 == s4); // true (same object refenerce)
    System.out.println(s4.equals(s1)); // true (same object with same content)
  }
}
