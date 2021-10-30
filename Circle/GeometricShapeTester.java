import java.util.Random;
// All casses have package access
public class GeometricShapeTester{

    private GeometricShape[] shapes;
    public static void main(String[] args){
         GeometricShapeTester shapeTester = new GeometricShapeTester();
         System.out.println("\nTest case 1:");
         double average = shapeTester.findAverage();
         System.out.println("average: "+Math.round(average));

         System.out.println("\nTest case 2:");
         GeometricShape s = shapeTester.getMax();
         System.out.println(s);


           GeometricShape[] shapes = shapeTester.getShapes();
           System.out.println("\nTest case 3:");
           System.out.println("list of the shapes:");
           for(GeometricShape e:shapes)
             System.out.println(e);

           System.out.println("\nTest case 4:");
           shapeTester.sort();
           System.out.println("shapes sorted in ascending order based on their area:");
           for(GeometricShape e:shapes)
             System.out.println(e);

    }
    public GeometricShapeTester(){
        shapes = new GeometricShape[20];
        Random rand = new Random();
        int option;
        final int COORD = 50;
        final int LENGTH1 = 50;
        final int LENGTH2 = 100;
        for(int i=0; i<shapes.length; i++){
            option=rand.nextInt(4);
            switch(option){
                case 0:
                    shapes[i]= new Rectangle(
                            rand.nextInt(COORD),
                            rand.nextInt(COORD),
                            rand.nextInt(LENGTH2),
                            rand.nextInt(LENGTH2));
                    break;
                case 1:
                    shapes[i]= new Square(
                            rand.nextInt(COORD),
                            rand.nextInt(COORD),
                            rand.nextInt(LENGTH2));
                    break;
                case 2:
                    shapes[i]= new Oval(
                            rand.nextInt(COORD),
                            rand.nextInt(COORD),
                            rand.nextInt(LENGTH1),
                            rand.nextInt(LENGTH2));
                    break;
                case 3:
                    shapes[i]= new Circle(
                            rand.nextInt(COORD),
                            rand.nextInt(COORD),
                            rand.nextInt(LENGTH1));
            }
        }
    }

    /**
     *
     * @return the average of all of the shape's area
     */
    public double findAverage(){
        // body
        if(shapes.length <= 0){
            return 0;
            //There are no shapes to add to calculate the area of.
        }
        double total = 0;
        for(GeometricShape i : shapes){
            total += i.getArea();
        }
        return total / shapes.length;
    }

    public GeometricShape getMax(){
        // body
        if(shapes.length <= 0){
            return null;
        }
        int largest = 0;
        for(int i = 0; i < shapes.length; i++){
            if(shapes[i].getArea() > shapes[largest].getArea()){
                largest = i;
            }
        }
        return shapes[largest];
    }
    /*
     * Insertion, QuickSort
     */
    public void sort(){
        // body
        for(int i = 0; i < shapes.length; i++){
            int smallest = i;
            for(int j = i; j < shapes.length; j++){
                if(shapes[j].getArea() < shapes[smallest].getArea()){
                    smallest = j;
                }
            }
            GeometricShape temp = shapes[i];
            shapes[i] = shapes[smallest];
            shapes[smallest] = temp;

        }
    }

    public GeometricShape[] getShapes(){
        return shapes;
    }
}

abstract class GeometricShape{
    private int x;
    private int y;
    public GeometricShape(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    abstract public double getArea();
    abstract public String toString();
}

class Rectangle extends GeometricShape{
    // body
    private int height;
    private int width;

    /**
     * This is the constructor for creating a rectangle.
     * @param x: if x <= 0, system force to set it to 0
     * @param y: if y <= 0, system force to set it to 0
     * @param height: if height <= 0, system force to set it to 0
     * @param width: if width <= 0, system force to set it to 0
     */

    public Rectangle(int x, int y, int height, int width){
        super(x, y);
        /*
         * If you did NOT check here, but in your javadoc you said I only accept positive
         * values, it is good enough
         */
        if(height <= 0) this.height = 0;
        else this.height = height;
        if(width <= 0) this.width = 0;
        else this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }


    /**
     * This method returns the area of the rectangle
     * @return the area of rect.
     */

    @Override
    public double getArea(){
        return height * width;
    }

    /**
     * This is the method that converts Rectangle to a string
     * @return the string of Rectangle.
     */

    @Override
    public String toString(){
        String s1 = "Rectangle: [";
        s1 += "x: " + this.getX();
        s1 += ", y: " + this.getY();
        s1 += " ,height: " + this.height + " ,width: " + this.width;
        s1 += " ,area: " + this.getArea() + "]";
        return s1;
    }

}

class Square extends Rectangle{
    // body
    public Square(int x, int y, int length){
        super(x, y, length, length);
    }

    @Override
    public String toString(){
        String s1 = "Square: [";
        s1 += "x: " + this.getX();
        s1 += ", y: " + this.getY();
        s1 += " ,length: " + super.getHeight();
        s1 += " ,area: " + this.getArea() + "]";
        return s1;
    }

}

class Oval extends GeometricShape{
    // body
    private int h_radius;
    private int v_radius;


    public Oval(int x, int y, int h_radius, int v_radius) {
        super(x, y);
        if(h_radius <= 0 || v_radius <= 0){
            this.h_radius = 0;
            this.v_radius = 0;
        }
        this.h_radius = h_radius;
        this.v_radius = v_radius;
    }


    public int getH_radius() {
        return h_radius;
    }

    public int getV_radius() {
        return v_radius;
    }

    @Override
    public double getArea(){
        return Math.round(h_radius * v_radius * Math.PI);
    }

    @Override
    public String toString(){
        String s1 = "Oval: [";
        s1 += "x: " + this.getX();
        s1 += ", y: " + this.getY();
        s1 += " ,h_radius: " + h_radius + " ,v_radius: " + v_radius;
        s1 += " ,area: " + this.getArea() + "]";
        return s1;
    }
}
class Circle extends Oval{

    // body
    public Circle(int x, int y, int radius) {
        super(x, y, radius, radius);
    }

    @Override
    public String toString(){
        String s1 = "Circle: [";
        s1 += "x: " + this.getX();
        s1 += " ,y: " + this.getY();
        s1 += " ,radius: " + super.getH_radius();
        s1 += " ,area: " + this.getArea() + "]";
        return s1;
    }
}

