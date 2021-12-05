package PullUpMethod;

public class IntFileProcessorSum extends IntFileProcessor{
    @Override
    protected int getVal(){
        return 0;
    }

    @Override
    protected int processInt(int original, int add){
        return original + add;
    }
}
