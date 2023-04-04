class Child {
    private int height;
    private double mass;

    public Child (int h, double m) {
        this.height = h;
        this.mass = m;
    }
    public boolean equals (Child other) {
        if (Math.abs(this.height - other.height) <= 2 && Math.abs(this.mass - other.mass) <= 0.5) {
          return true;
        }
        else {
          return false;
        }
    }

    public String toString() {
        double BMI = this.mass / ((this.height/100.0) * (this.height/100.0));
        if (BMI <= 18) return "Child - bad";
        return "Child - good";
    }
}