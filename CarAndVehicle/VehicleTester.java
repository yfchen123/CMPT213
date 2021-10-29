import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class VehicleTester {
    Car toyota = new Car(15, 50);

    public static void main(String[] args) {
        Car toyota = new Car(15, 50);
        //toyota.moveVehicle(750);
        System.out.println(toyota);
    }
    @Test
    void checkEnoughFuel(){
        int expected = 1;
        assertEquals(expected, toyota.moveVehicle(700));
    }

    @Test
    void checkInsufficientFuel(){
        int expected = 0;
        assertEquals(expected, toyota.moveVehicle(1000));
    }

    @Test
    void toyotaOctaneTank(){
        double expected = 15;
        assertEquals(expected, toyota.getOctaneTank());
    }

    @Test
    void testAddOctane(){
        double expected = 25;
        assertEquals(expected, toyota.addOctane(10));
    }
}
