package DuplicateClasses;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class is basically the same as the IntFileSum class except for multiplying instead of dividing.
 */
public class IntFileProduct {
    int multiplyUpNumbers(File file){
        try(FileReader r = new FileReader(file)){
            Scanner s = new Scanner(r);
            int product = 1;
            while(s.hasNextInt()){
                product *= s.nextInt();
            }
            return product;
        } catch (IOException e){
            e.printStackTrace();
        }
        return 0;
    }
}
