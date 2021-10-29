public class Book {

    private int pages;

    public Book() {
        this.pages = 0;
    }

    public Book(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        String out = "[ pages: " + this.pages + " ]";
        return out;
    }
}
