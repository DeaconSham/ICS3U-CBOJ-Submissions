class Fraction {
    private int num;
    private int den;

    public void setNumerator (int newN) {
        this.num = newN;
    }
    public int getNumerator () {
        return this.num;
    }
    public void setDenominator (int newD) {
        if (newD == 0) {
            newD = 1;
        }
        if (newD >= 1) {
            this.den = newD;
        }
        else {
            this.den = -(newD);
            this.num = -(this.num);
        }
    }
    public int getDenominator () {
        return this.den;
    }
    public Fraction (int n, int d) {
        if (d == 0) {
            d = 1;
        }
        if (d >= 0) {
            this.num = n;
            this.den = d;
        }
        else {
            this.num = -(n);
            this.den = -(d);
        }
    }
    public Fraction () {
        this.num = 0;
        this.den = 1;
    }
    public void invert() {
        int temp = this.num;
        this.num = this.den;
        this.den = temp;

        if (this.den <= 0) {
            this.num = -(this.num);
            this.den = -(this.den);
        }
    }
    public void print () {
        System.out.println(this.num + "/" + this.den);
    } 
}