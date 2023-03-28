import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    int V = ui.nextInt();
    String inpit = ui.nextLine();
    String votes = ui.nextLine();
    int aCount = votes.length() - votes.replace("A", "").length();
    
    if (aCount == 0) {
      System.out.println("B");
    }
    else {
      if (V / aCount == 2) {
        System.out.println("Tie");
      }
  
      else if (V / aCount < 2) {
        System.out.println("A");
      }
  
      else if (V / aCount > 2) {
        System.out.println("B");
      }
    }
  }
}