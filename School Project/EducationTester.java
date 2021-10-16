public class EducationTester {
    public static void main(String[] args) {
        Instructor myInstructor = new Instructor(35, "Hossien Mohammed");
        Instructor Bita = new Instructor(40, "Bita Shadger");
        //This line should crash the program.
        //Instructor imaginary = new Instructor(-5, "Imaginary");
        Classroom secondClassroom = new Classroom(1, 150, true, myInstructor);
        System.out.println(secondClassroom.toString());

        Education sfu = new Education();
        System.out.println(sfu.toString());
        sfu.addRoom(secondClassroom);
        sfu.addInstructor(Bita);

        Classroom firstCPSC = new Classroom(2, 200, true, Bita);
        sfu.addRoom(firstCPSC);

        System.out.println(sfu.toString());
        sfu.printInstructorList();
        sfu.printRoomList();

        Instructor bryan = new Instructor(45, "Bryan Green");
        Classroom lanCPSCRoom = new Classroom(101, 35, true, bryan);
        Education langara = new Education();
        langara.addRoom(lanCPSCRoom);
        langara.addInstructor(bryan);
    }
}
