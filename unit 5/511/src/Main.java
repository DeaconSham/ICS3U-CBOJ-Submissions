import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    int r = ui.nextInt();
    int c = ui.nextInt();
    int[][] a = new int [r][c];

    for (int row = 0; row < r; row++) {
      for (int col = 0; col < c; col++) {
        a[row][col] = ui.nextInt();
      }
    }
    for (int i = c-1; i >=0; i--) {
      System.out.print("\n");
      for (int j = r-1; j >= 0; j--) {
        System.out.print(a[j][i]);
      }
    }
  }
}