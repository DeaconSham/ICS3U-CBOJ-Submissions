import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    int n = Integer.parseInt(ui.nextLine());
    String[] name1 = ui.nextLine().split("\\s+");
    String[] name2 = ui.nextLine().split("\\s+");;

    HashMap<String, String> one = new HashMap<>();
    HashMap<String, String> two = new HashMap<>();
    boolean legal = true;
    
    for (int i = 0; i < n; i++) {
      //System.out.println(names1[i] + " " + names2[i]);
      if (name1[i].equals(name2[i])) {
        legal = false;
      }
      else {
        one.put(name1[i], name2[i]);
        two.put(name2[i], name1[i]);
      }
    }

    if (legal == false || !one.equals(two)) {
      System.out.println("bad");
    }
    else if (legal == true && one.equals(two)) {
      System.out.println("good");
    }
  }
}