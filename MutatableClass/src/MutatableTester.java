import java.sql.Time;
import java.util.Date;
import java.util.GregorianCalendar;

public class MutatableTester {
    public static void main(String[] args) {
        Date myDate = new GregorianCalendar(2000, 5, 31).getTime();
        Mutatable myMutatable = new Mutatable("Item C",
                myDate);
        System.out.println(myMutatable.toString());

        //Now we can call a getter.
        Date itemDate = myMutatable.getDateCreated();

        //Now a malicious programmer can change the date value of myMutatable
        itemDate.setTime(10000000);
        //The date of myMutatable is now set to Dec 31st 1969
        System.out.println(myMutatable.toString());
    }
}
