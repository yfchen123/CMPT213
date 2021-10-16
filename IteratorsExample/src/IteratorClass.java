import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {

    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        data.add("Objected-Oriented");
        data.add("Design");
        data.add("in");
        data.add("Java");

        //IMPORTANT
        Iterator<String> dataltr = data.iterator();
        while(dataltr.hasNext())
        {
            String temp = dataltr.next();
            if(temp.contains("i"))
            {
                System.out.printf("%s%n", temp);
            }
        }
        /* Will come back when we talk about in details Set/Map
        while(dataltr.hasNext())
        {
            if(dataltr.getCurrent().contains("i"))
            {
                System.out.println("%s$n", dataltr.getCurrent());
            }
        }
        */
    }
}
