public class Classroom {
    private int roomNumber;
    private int capacity;
    private boolean availability;
    private Instructor classroomInstructor;

    public Classroom(int roomNumber, int capacity, boolean availability) {
        assert roomNumber >= 0 : "Please enter in a positive value for the room number.";
        assert capacity >= 0 : "Please enter in a positive value for the capacity.";
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.availability = availability;
    }


    public Classroom(int roomNumber, int capacity, boolean availability, Instructor classroomInstructor) {
        assert roomNumber >= 0 : "Please enter in a positive value for the room number.";
        assert capacity >= 0 : "Please enter in a positive value for the capacity.";
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.availability = availability;
        this.classroomInstructor = classroomInstructor;
    }



    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @return true if the room is available and false if it is not available.
     */
    public boolean getAvailability() {
        return availability;
    }

    public Instructor getClassroomInstructor(Instructor instructor){
        return instructor;
    }

    /**
     *
     * @param roomNumber The room number must be positive.
     */
    public void setRoomNumber(int roomNumber) {
        assert roomNumber >= 0 : "Please enter in a positive value for the room number.";
        this.roomNumber = roomNumber;
    }

    /**
     *
     * @param capacity The capacity should be larger than 0.
     */

    public void setCapacity(int capacity) {
        assert capacity >= 0 : "Please enter in a positive value for the capacity.";
        this.capacity = capacity;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setClassroomInstructor(Instructor instructor){
        classroomInstructor = instructor;
    }


    @Override
    public String toString() {
        if(classroomInstructor == null){
            return "Classroom{" +
                    "roomNumber=" + roomNumber +
                    ", capacity=" + capacity +
                    ", availability=" + availability +
                    + '}';
        }
        return "Classroom{" +
                "roomNumber=" + roomNumber +
                ", capacity=" + capacity +
                ", availability=" + availability +
                ", classroomInstructor=" + classroomInstructor +
                '}';
    }
}
