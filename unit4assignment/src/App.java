import java.util.Scanner; 

public class App {
  public static void main(String[] args) {
    Scanner ui = new Scanner (System.in);
    //initialise variables
    int a = 1;
    int b = 1;
    int c = 1;
    while (a != 0 || b != 0 || c != 0) {
      //program input
      System.out.println("\nProvide three side lengths - 0 0 0 to terminate.");
      a = ui.nextInt();
      b = ui.nextInt();
      c = ui.nextInt();
      if (triangle(a, b, c) == " Triangle possible: ") {
        //if triangle is possible, print program
        System.out.println(a + " " + b + " " + c + triangle(a, b, c) + side(a, b, c) + angle(a, b, c) + angleCalc(a, b, c) + "\nPerimeter (in units): " + perimeterOutput(a, b, c) + "\nArea (in squared units): " + areaOutput(a, b, c));
      }
      else if (triangle(a, b, c) == " Triangle cannot be formed. ") {
        //if triangle is not possible, print not possible
        System.out.println(a + " " + b + " " + c + triangle(a, b, c));
      }
      else {
        break;
      }
    }
    //program termination
    System.out.println("0 0 0 Program was terminated by user.");
    ui.close();
  }
  public static String triangle(int a, int b, int c) {
    //if possible is triangle method
    if ((a+b) > c && (a+c) > b && (b+c) > a) {
      //using pythagorean theorem to see if triangle is possible
      return " Triangle possible: ";
    }
    else {
      return " Triangle cannot be formed. ";
    }
  }
  public static String side(int a, int b, int c) {
    if (a == b && a == c && b == c) {
      //all sides equal, so equilateral
      return "equilateral";
    }
    else if (a != b && a != c && b != c) {
      //all sides different, so scalene
      return "scalene and";
    }
    else {
      //else, isosceles
      return "isosceles and";
    }
  }
  public static String angle(int x, int y, int z) {
    double x2 = Math.pow(x, 2);
    double y2 = Math.pow(y, 2);
    double z2 = Math.pow(z, 2);
    double AngX = Math.toDegrees(Math.acos((y2+z2-x2)/(2*y*z)));
    double AngY = Math.toDegrees(Math.acos((x2+z2-y2)/(2*x*z)));
    double AngZ = Math.toDegrees(Math.acos((x2+y2-z2)/(2*x*y)));
    if (Math.abs(x*x + y*y - z*z) < 0.2) {
      //using pythagorean theorem to verify if its a right angle
      return " right.";
    }
    else if (Math.abs(x*x + y*y - z*z) < 0.2) {
      //using pythagorean theorem to verify if its a right angle
      return " right.";
    }
    else if (Math.abs(z*z + y*y - x*x) < 0.2) {
      //using pythagorean theorem to verify if its a right angle
      return " right.";
    }
    else if (Math.cos(x) == Math.cos(y) && Math.cos (x) == Math.cos (z) && Math.cos (y) == Math.cos (z)) {
      //if all angles are equal, its an equilateral
      return ".";
    }
    else if (AngX > 90 || AngY > 90 || AngZ > 90) {
      //using cosine law to find the angles of a triangle with the data provided
      return " obtuse.";
    }
    else {
      //else, obtuse triangle
      return " acute.";
    }
  }
  public static String angleCalc(double x, double y, double z) {
    //using cosine law to find the angles of the triangles with the provided lengths
    double x2 = Math.pow(x, 2);
    double y2 = Math.pow(y, 2);
    double z2 = Math.pow(z, 2);
    double AngX = Math.acos((y2+z2-x2)/(2*y*z));
    double AngY = Math.acos((x2+z2-y2)/(2*x*z));
    double AngZ = Math.acos((x2+y2-z2)/(2*x*y));
    AngX = Math.toDegrees(AngX);
    AngX = AngX*10;
    AngX = Math.round(AngX);
    AngX = AngX/10;
    AngY = Math.toDegrees(AngY);
    AngY = AngY*10;
    AngY = Math.round(AngY);
    AngY = AngY/10;
    AngZ = Math.toDegrees(AngZ);
    AngZ = AngZ*10;
    AngZ = Math.round(AngZ);
    AngZ = AngZ/10;
    String output = ("\nAngle A (in degrees): " + AngX + "\nAngle B (in degrees): " + AngY + "\nAngle C (in degrees): " + AngZ);
    return output;
  }
  public static int perimeterOutput(int a, int b, int c) {
    //using formulas to find perimeter with inputs provided
    int p = a+b+c;
    return p;
  }
  public static double areaOutput(int a, int b, int c) {
    //using formulas to find area with inputs provided
    int p = a+b+c;
    double sp = (p / 2.0);
    sp = sp*10;
    sp = Math.round(sp);
    sp = sp/10;
    double area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
    area = area*10;
    area = Math.round(area);
    area = area/10;
    return area;
  }
}