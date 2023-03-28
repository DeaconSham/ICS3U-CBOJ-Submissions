import java.util.*;
public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(), c = sc.nextInt();
    int [][] a = new int[r][c];

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println(sum(a));
  }
  public static int sum(int[][] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        sum += a[i][j];
      }
    }
    return sum;
  }
}