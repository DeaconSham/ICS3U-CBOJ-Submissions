//1. Fraction myFraction = new Fraction(2, 7);
//2. Fraction p = new Fraction(); **create an object of type Fraction**
//    p.num = 7; 
//    p.den = 8; 
//3. So after the execution of the code fragment, the object p represents the fraction 1/3, the object q represents the fraction 8/3, and the object r (which is the same as q) also represents the fraction 8/3.
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ui = new Scanner (System.in);
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.num = ui.nextInt();
        f1.den = ui.nextInt();
        f2.num = ui.nextInt();
        f2.den = ui.nextInt();
        //a
        f1.num = f1.num*2;
        System.out.println(f1.num + "/" + f1.den);
        //b
        int temp = f2.den;
        f2.den = f2.num;
        f2.num = temp;
        System.out.println(f2.num + "/" + f2.den);
        //c
        f1.num = f1.num*f2.num;
        f1.den = f1.den*f2.den;
        System.out.println(f1.num + "/" + f1.den);
        //d
        f2.num = (f1.num*f2.den) + (f2.num*f1.den);
        f2.den = f1.den*f2.den;
        System.out.println(f2.num + "/" + f2.den);
        //e
        f1.num = Math.abs(f1.num);
        f1.den = Math.abs(f1.den);
        System.out.println(f1.num + "/" + f1.den);
    }
}