public class App {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       //read in integer values
       int [] nums = new int[4];
       int [] dens = new int[4];
       for (int i=0; i<4; i++){
         nums[i] = s.nextInt();
         dens[i] = s.nextInt();
       }
        //set fractions with user input
        Fraction a = new Fraction(nums[0],dens[0] );
        Fraction b = new Fraction(nums[1],dens[1] );
        Fraction c = new Fraction( );
        Fraction d = new Fraction( );

       //call getters/setters 
        System.out.println(a.getNumerator());
        System.out.println(a.getDenominator());
        System.out.println(b.getNumerator());
        System.out.println(b.getDenominator());

        c.setNumerator(nums[2]);
        c.setDenominator(dens[2]);
        d.setNumerator(nums[3]);
        d.setDenominator(dens[3]);

        d.invert();
       //print fractions
        a.print();
        b.print();
        c.print();
        d.print();
    }
}