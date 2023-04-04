import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Fraction p = new Fraction(s.nextInt(), s.nextInt());
        Fraction q = new Fraction(s.nextInt(), s.nextInt());
        Fraction.product(p, q).print(); // 1 
        Fraction.abs(q).print();        // 2
        System.out.println(Fraction.isPositive(p)); // 3
        System.out.println(Fraction.isPositive(q)); // 3
    }
}