import java.util.*;
public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int [][] a = new int[r][];

    for (int i = 0; i < r; i++) {
      int len = sc.nextInt();
      a[i] = new int[len];
      for (int j = 0; j < len; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println(max(a));
  }

  public static int max(int[][] a) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > max) {
          max = a[i][j];
        }
      }
    }
    return max;
  }
}