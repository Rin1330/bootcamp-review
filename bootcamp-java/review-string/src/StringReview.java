public class StringReview {

  public static void main(String[] args) {
    String s = "South China Morning Post";
    String s2 = "";
    String s3 = "China";
    String s4 = "South";
    String s5 = " Lot of space      ";
    String match1 = "Match";
    String match2 = "Match";

    // String method
    System.out.println("length(): " + s.length());
    System.out.println("charAt(3): " + s.charAt(3));
    System.out.println("isEmpty(): " + s.isEmpty());
    System.out.println("isBlank(): " + s2.isBlank());
    System.out.println("substring(int startIndex: 3): " + s.substring(3));
    System.out.println("substring(int startIndex: 3, int endIndex: 10): "
        + s.substring(3, 10));
    System.out.println("isLowerCase(): " + s.toLowerCase());
    System.out.println("isUpperCase(): " + s.toUpperCase());
    System.out.println("replace(\'o\', \'Z\'): " + s.replace('o', 'Z'));
    System.out.println("replace(without \'B\', \'Z\'): " + s.replace('B', 'Z'));
    System.out
        .println("replace(\"South\", \"shit\"): " + s.replace("South", "shit"));
    System.out.println("contains(CharSequence): " + s.contains(s3));
    System.out.println("endsWidth(String suffix): " + s.endsWith(s3));
    System.out.println("startsWidth(String suffix): " + s.startsWith(s4));
    System.out.println("trim(): " + s5.trim());
    System.out.println(
        "equals(): lowerCase has different upperCase" + match1.equals(match2));
    System.out.println("indexOf(int/ch): " + s.indexOf('M')); // -1 is not found
    System.out.println("indexOf(String): " + s.indexOf("hi")); // -1 is not found
  }
}
