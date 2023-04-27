import java.io.*;
import java.util.*;
public class App {
    //note the App class is only used for testing
    //it will output intersection and totalPerimeter methods
    //for the int values you put in order within String (x, y, w, h)
    public static Scanner ui = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        Rectangle x = new Rectangle(-4, -3, 7, 5);
		Rectangle y = new Rectangle(-5, -5, 1, 3);
        System.out.println(Rectangle.intersection(x, y).toString());
        System.out.println(Rectangle.totalPerimeter(x, y));
    }
}
