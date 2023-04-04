class Fraction {
    int num;
    int den;

    public void plusEquals(Fraction other) {
        this.num = (this.num * other.den) + (other.num * this.den);
        this.den = (this.den * other.den);
    }
    public Fraction plus (Fraction other) {
        Fraction result = new Fraction();
        result.num = (this.num * other.den) + (other.num * this.den);
        result.den = (this.den * other.den);
        return result;
    }
    public void reduce() {
        int gcd = gcd(this.num, this.den);
        this.num /= gcd;
        this.den /= gcd;
    }
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
    public int gcd(int a, int b) {
        if (b == 0) {
        return a;
        }
        return gcd(b, a % b);
    }
}