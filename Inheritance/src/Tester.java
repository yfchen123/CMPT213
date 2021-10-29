public class Tester {

    public static void main(String[] args) {

        Book newOne = new Dictionary(100, 500);
        System.out.println(newOne.getPages());

        Book a = new Book();

        //Dictionary b = new Book();
        // in any OOP following will happen:
        // 1. if you create an object (default or any other constructor)
        // java will call Object class
        // 2. checks if you have any parent class (this includes hierarch structure)
        // 3. it starts from top to bottom (NOT bottom to up) to create an object

        System.out.println(a);
        System.out.println(newOne);
    }
}
