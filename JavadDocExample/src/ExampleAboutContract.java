public class ExampleAboutContract {

    public static void main(String[] args) {
        Point2D d = new Point2D(-1, -2);
        System.out.println(d.getArea() + " is my area.");

        Point2D d1 = new Point2D(1, 2);
        System.out.println(d1.getArea() + " is my area.");

        System.out.println(d1.getSquareRoot(-2.5));

    }
}
