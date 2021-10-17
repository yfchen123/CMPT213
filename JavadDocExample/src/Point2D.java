/**
 *
 */
public class Point2D {

    // what is x and y? what are they doing here?
    private int x;
    private int y;
    private double root;

    public Point2D()
    {
        this.x = 0;
        this.y = 0;
    }

    /*
     * @param x: positive integer location
     * @param y: positive integer location
     */
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getArea()
    {
         return x * y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // again, should you set negative value?
    public void setX(int x) {
        this.x = x;
    }

    // again, should you set negative value?
    public void setY(int y) {
        this.y = y;
    }

    // hey for negative or 0, return 0.0
    public double getSquareRoot(double r)
    {
        assert r >= 0 : "negative number does NOT have square root.";
        this.root =r;
//        if(r < 0)
//            //return 0.0;
//            throw new IllegalArgumentException("Please do NOT provide a negative number");
       return Math.sqrt(this.root);
    }
}
