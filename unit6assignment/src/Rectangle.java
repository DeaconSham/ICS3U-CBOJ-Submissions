class Rectangle { //1
    private int left, bot, width, height;
    public Rectangle () { //2
        this.left = 0;
        this.bot = 0;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle (int x, int y, int w, int h) { //3
        this.left = x;
        this.bot = y;
        this.width = Math.max(0,w);
        this.height = Math.max(0, h);
    }
    public void set (int x, int y, int w, int h) { //4
        this.left = x;
        this.bot = y;
        this.width = Math.max(0,w);
        this.height = Math.max(0, h);
    }
    public String toString() { //5
        return "base: (" + this.left + "," + this.bot + ") w:" + this.width + " h:" + this.height; 
    }
    public int area() { //6
        return this.width * this.height;
    }
    public int perimeter() { //7
        if (this.height == 0 && this.width == 0) {
            return 0;
        }
        else if (this.width == 0) {
            return this.height;
        }
        else if (this.height == 0) {
            return this.width;
        }
        else {
            return (2 * this.width) + (2 * this.height);
        }
    }
    public boolean contains (Rectangle other) { //8
        if (this.bot + this.height >= other.bot + this.height && this.left + this.width >= other.left + other.width && this.left <= other.left && this.bot <= other.bot) {
            return true;
        }
        else {
            return false;
        }
    }
    public static Rectangle intersection (Rectangle r1, Rectangle r2) { //9
        if (r1.contains(r2)) {
            return r2;
        }
        else if (r2.contains(r1)) {
            return r1;
        }
        else {
            int r1R = r1.left + r1.width;
            int r1T = r1.bot + r1.height;
            int r2R = r2.left + r2.width;
            int r2T = r2.bot + r2.height;
            if (r1.left > r2.left && r1.left < r2R) {
                if (r1T < r2T && r1T > r2.bot) {
                  return new Rectangle (r1.left, r2.bot, r2R - r1.left, r1T - r2.bot);
                } 
                else if (r1.bot > r2.bot && r1.bot < r2T) {
                  return new Rectangle (r1.left, r1.bot, r2R - r1.left, r2T - r1.bot);
                }
            } 
              else if (r1R > r2.left && r1R < r2R) {
                if (r1T < r2T && r1T > r2.bot) {
                  return new Rectangle (r2.left, r2.bot, r1R - r2.left, r1T - r2.bot);
                } 
                else if (r1.bot > r2.bot && r1.bot < r2T) {
                  return new Rectangle (r2.left, r1.bot, r1R - r2.left, r2T - r1.bot);
                }
            }
                else if (r2.left > r1.left && r2.left < r1R) {
                if (r2T < r1T && r2T > r1.bot) {
                  return new Rectangle (r2.left, r1.bot, r1.left - r2R, r2T - r1.bot);
                } 
                else if (r2.bot> r1.bot && r2.bot < r1T) {
                  return new Rectangle (r2.left, r2.bot, r1R - r2.left, r1T - r2.bot);
                }
            } 
              else if (r2R < r1R && r2R > r1.left) {
                if (r2T < r1T && r2T > r1.bot) {
                  return new Rectangle (r1.left, r1.bot, r2R - r1.left, r2T - r1.bot);
                }
                else if (r2.bot > r1.bot && r2.bot < r1T) {
                  return new Rectangle (r1.left, r2.bot, r2R - r1.left, r1T - r2.bot);
                }
            }
        }
    }
    public static int totalPerimeter (Rectangle r1, Rectangle r2) {
        return (r1.perimeter() + r2.perimeter()) - intersection(r1, r2).perimeter();
    }
}