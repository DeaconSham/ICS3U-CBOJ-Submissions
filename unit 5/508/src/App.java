import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    char c = ui.nextLine().charAt(0);
    c = Character.toLowerCase(c);
    String s = ui.nextLine().toLowerCase().replaceAll("\\s", "");
    System.out.println(count(c, s));
  }
  public static int count (char c, String s) {
    int count = 0;
    for (int a = 0; a < s.length(); a++) {
      if (s.charAt(a) == c) {
        count += 1;
      }
    }
    return count;
  }
}