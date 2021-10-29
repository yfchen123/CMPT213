public class Dictionary extends Book{

    // do NOT shadow copy your parent
    // 1. if your parent has it, just use it
    // 2. if you need create it for yourself ONLY (do NOT assume parent knows it)
    private int definitions;

    public Dictionary() {
        this.definitions = 0;
    }

    public Dictionary(int definitions) {
        this.definitions = definitions;
    }

    public Dictionary(int pages, int definitions) {
        super(pages);
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }

    /*
     * explain why you return -Anything
     */
    public double computeRatio() {
        int temp = super.getPages();
        if(temp > 0)
            return this.definitions / super.getPages();
        return -1;
    }

    // please do NOT create the methods already exist in your parent
   /* public int getPages() {
        return super.getPages();
    }*/
    @Override
    public String toString()
    {
        String out = "[pages: " + this.getPages() + ", definitions: " + this.definitions + "]";
        return out;
    }
}
