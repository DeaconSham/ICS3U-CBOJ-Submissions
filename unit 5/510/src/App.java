import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String number = sc.next().replace("-", "");
      number = number.substring(0, Math.min(number.length(), 10));

      for (int j = 0; j < number.length(); j++) {
        if (number.charAt(j) == 'A' || number.charAt(j) == 'B' || number.charAt(j) == 'C') {
          number = number.substring(0, j) + 2 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'D' || number.charAt(j) == 'E' || number.charAt(j) == 'F') {
          number = number.substring(0, j) + 3 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'G' || number.charAt(j) == 'H' || number.charAt(j) == 'I') {
          number = number.substring(0, j) + 4 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'J' || number.charAt(j) == 'K' || number.charAt(j) == 'L') {
          number = number.substring(0, j) + 5 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'M' || number.charAt(j) == 'N' || number.charAt(j) == 'O') {
          number = number.substring(0, j) + 6 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'P' || number.charAt(j) == 'Q' || number.charAt(j) == 'R' || number.charAt(j) == 'S') {
          number = number.substring(0, j) + 7 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'T' || number.charAt(j) == 'U' || number.charAt(j) == 'V') {
          number = number.substring(0, j) + 8 + number.substring(j + 1);
        }
        if (number.charAt(j) == 'W' || number.charAt(j) == 'X' || number.charAt(j) == 'Y' || number.charAt(j) == 'Z') {
          number = number.substring(0, j) + 9 + number.substring(j + 1);
        }
      }
      System.out.println(number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6));
    }
  }
}