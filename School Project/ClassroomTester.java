public class ClassroomTester {
    public static void main(String[] args) {
        //This line should throw exceptions.
        //Classroom myClassroom = new Classroom(-3, 50, true);
        Classroom secondClassroom = new Classroom(1, 150, true);

        //The line below should throw exceptions
        //secondClassroom.setRoomNumber(-5);
        //secondClassroom.setCapacity(-5);

        System.out.println(secondClassroom.toString());
    }
}
