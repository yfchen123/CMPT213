package DuplicateClasses;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class IntFileSum {
    int sumUpNumbers(File file){
        try(FileReader r = new FileReader(file)){
            Scanner s = new Scanner(r);
            int sum = 0;
            while(s.hasNextInt()){
                sum += s.nextInt();
            }
            return sum;
        } catch (IOException e){
            e.printStackTrace();
        }
        return 0;
    }
}
