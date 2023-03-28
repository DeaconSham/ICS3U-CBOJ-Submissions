import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    String w = ui.nextLine();
    String sub = "";
    String rev = "";
    int longest = 1;

    for (int i = 0; i < w.length(); i++) {
      for (int j = i; j < w.length(); j++) {
        sub = w.substring(i, j+1);
        rev = new StringBuilder(sub).reverse().toString();
        if (sub.equals(rev)) {
          if (sub.length() > longest) {
            longest = sub.length();
          }
        }
      }
    }
    System.out.println(longest);
  }
}