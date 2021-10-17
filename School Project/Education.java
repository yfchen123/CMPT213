import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;

public class Education {

    // where is your iterator?
    private List<Classroom> roomList;
    private List<Instructor> instructorList;

    public Education(){
        roomList = new ArrayList<>();
        instructorList = new ArrayList<>();
    }


    public void printRoomList(){
        for(Classroom room : roomList){
            System.out.println(room.toString());
        }
    }

    public void printInstructorList(){
        for(Instructor instructor : instructorList){
            System.out.println(instructor.toString());
        }
    }

    public void addRoom(Classroom room){
        roomList.add(room);
    }

   public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
   }

   public void removeRoom(Classroom room){
        assert roomList.contains(room) : "This room is not inside this Education System.";
        roomList.remove(room);
   }

   public void removeInstructor(Instructor instructor){
        assert instructorList.contains(instructor) : "This instructor does not belong to this Education System.";
        instructorList.remove(instructor);
   }



    @Override
    public String toString(){
        if(roomList.isEmpty()){
            return "The Education System is currently empty!";
        }
        String str = "Classroom List:\n";
        for(Classroom room : roomList){
            str += room.toString();
            str += "\n";
        }
        str += "Instructor List:\n";
        for(Instructor instructor : instructorList){
            str += instructor.toString();
            str += "\n";
        }
        return str;
    }

    /*
     * This method exist for future purpose -> maybe some day we will use it
    */

    public Iterable<Classroom> rooms()
    {
        return new Iterable<Classroom>(){
            
            @Override
            public Iterator<Classroom> iterator()
            {
                return Collection.unmodifiableCollections(roomList);
            }
        }
    };


}
