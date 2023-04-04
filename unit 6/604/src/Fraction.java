class Fraction {
    int num;
    int den;

    public Fraction() {
        this.num = 0;
        this.den = 1;
    }
     public Fraction (int numerator, int denominator) {
        this.num = numerator;
        this.den = denominator;
    }
    public Fraction (Fraction f) {
        this.num = f.num;
        this.den = f.den;
    }
    //be sure to include an instance method for equals in your fraction class
    public boolean equals (Fraction other) {
        if (this.num == other.num && this.den == other.den) {
            return true;
        }
        else {
            return false;
        }
    }
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}