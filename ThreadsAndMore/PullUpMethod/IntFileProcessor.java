package PullUpMethod;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

abstract class IntFileProcessor {
    int processFile(File file){
        try(FileReader r = new FileReader(file)){
            Scanner s = new Scanner(r);
            int startValue = getVal();
            while(s.hasNextInt()){
                startValue = processInt(startValue, s.nextInt());
            }
            return startValue;
        } catch (IOException e){
            e.printStackTrace();
        }
        return 0;
    }

    abstract protected int getVal();
    abstract protected int processInt(int myValue, int next);
}
