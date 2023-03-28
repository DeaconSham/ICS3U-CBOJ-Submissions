import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        List<Integer> scores = new ArrayList<Integer>();
        int[] occur = new int[10];
        double total = 0; 
        int count = 0;
        int a = ui.nextInt();
        while (a >= 0) {
            if (a <=10) {
                scores.add(a);
                occur[a-1] +=1;
                total += a;
                count++;
            }
            a = ui.nextInt();
        }
        System.out.println("Score  #Occurrences");
        for (int i = 0; i < occur.length; i++) {
            if (i == 9) {
                System.out.println(i+1 + "     " + occur[i]);
            }
            else {
                System.out.println(i+1 + "      " + occur[i]);
            }
        }
        System.out.println("Mean: " + Math.round((total/count)*10)/10.0);
    }
}