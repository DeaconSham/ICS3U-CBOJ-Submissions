//Q1:
/*
 * 
 * a) 4/5
 * b) 7/-5
 * c) 5/6
 * d) -9/-12
 * e) 13/20
 */

import java.io.*;
import java.util.*;

public class Main {
    //DO NOT ALTER THE MAIN --- Add your Fraction class
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        Fraction a = new Fraction( );
        Fraction b = new Fraction( );
        Fraction c = new Fraction( );
        Fraction d = new Fraction( );

       //set fractions with user input
       a.num = s.nextInt();
       a.den = s.nextInt();
       b.num = s.nextInt();
       b.den = s.nextInt();
       c.num = s.nextInt();
       c.den = s.nextInt();

       //call instance methods
        a.plusEquals(b);
        d = a.plus(c);
        d.reduce();

       //print fractions with instance method
        a.print();
        b.print();
        c.print();
        d.print();

    }
}