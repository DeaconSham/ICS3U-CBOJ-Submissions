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
        return this.left <= other.left && this.bot <= other.bot && this.left + this.width >= other.left + other.width && this.bot + this.height >= other.bot + other.height;
        }
    public static Rectangle intersection (Rectangle r1, Rectangle r2) { //9
        int lefties = Math.max(r1.getLeft(), r2.getLeft());
        int botsies = Math.max(r1.getBot(), r2.getBot());
        int rightsies = Math.min(r1.getLeft() + r1.getWidth(), r2.getLeft() + r2.getWidth());
        int topsies = Math.min(r1.getBot() + r1.getHeight(), r2.getBot() + r2.getHeight());
        if (lefties > rightsies || botsies > topsies) {
            return new Rectangle();
        }
        else {
            return new Rectangle(lefties, botsies, rightsies - lefties, topsies - botsies);
        }
    }
    public static int totalPerimeter (Rectangle r1, Rectangle r2) {
        return (r1.perimeter() + r2.perimeter()) - intersection(r1, r2).perimeter();
    }
    //get methods to execute methods 9 and 10
    public int getLeft() {
        return left;
    }
    public int getBot() {
        return bot;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
