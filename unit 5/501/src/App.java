/* Answers:
4
0
3
*/
import java.util.Scanner;

public class App {
    public static Scanner ui = new Scanner(System.in);
    public static void main(String[] args) {
        int[] sample = new int[10];

        for (int i = 0; i < sample.length; i++) {
            sample[i] = ui.nextInt();
            //read values of the sample array inputted by the user
        }

        int temp = sample[0];
        sample[0] = sample[9];
        sample[9] = temp;
        //switching the values at either end of the array

        int sampleSum = 0;
        for (int j = 0; j < sample.length; j++) {
            if (sample[j] < 0) {
                sample[j] = Math.abs(sample[j]);
                //changing negative values to positive arrays
            }
            sampleSum += sample[j];
            //sum of array
        }

        System.out.println(sampleSum); //print sampleSum
        for (int a = 0; a < sample.length; a++) {
            if(a % 2 == 0) {
                System.out.print(sample[a] + " ");
                //finding and printing values at even numbered locations
            }
        }
    }
}