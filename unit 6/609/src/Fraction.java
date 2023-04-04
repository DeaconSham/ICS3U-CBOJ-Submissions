class Fraction {
    private int num, den;

    public void print () {
        System.out.println(this.num + "/" + this.den);
    }
    public Fraction (int n, int d) {
        this.num = n;
        this.den = d;
    }
    public static Fraction product (Fraction a, Fraction b) {
        Fraction result = new Fraction(a.num*b.num, a.den*b.den);
        int gcd = gcd(result.num, result.den);
        result.num /= gcd;
        result.den /= gcd;
        return result;
    }
    public static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static Fraction abs (Fraction a) {
        Fraction result = new Fraction(Math.abs(a.num), Math.abs(a.den));
        int gcd = gcd(result.num, result.den);
        result.num /= gcd;
        result.den /= gcd;
        return result;
    }
    public static boolean isPositive (Fraction a) {
        return a.num*a.den > 0;
    }
}