package PullUpMethod;

public class IntFileProcessorProduct extends IntFileProcessor{
    @Override
    protected int getVal(){
        return 1;
    }

    @Override
    protected int processInt(int original, int multiple){
        return original * multiple;
    }
}
