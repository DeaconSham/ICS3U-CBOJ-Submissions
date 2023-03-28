import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    char oldChar = ui.nextLine().charAt(0);
    char newChar = ui.nextLine().charAt(0);
    String s = ui.nextLine();
    System.out.println(replace(s, oldChar, newChar));
  }
  public static String replace (String s, char oldChar, char newChar) {
    boolean skip = true;
    for (int a = 0; a < s.length(); a++) {
      if (s.charAt(a) == oldChar) {
        if (skip == false) {
          s = s.substring(0, a) + newChar + s.substring(a + 1);
          skip = true;
        }
        else {
          skip = false;
        }
      }
    }
    return s;
  }
}
