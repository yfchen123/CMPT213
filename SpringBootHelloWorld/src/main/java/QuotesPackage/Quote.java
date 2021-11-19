package QuotesPackage;

public class Quote {
    private long id;
    private String author;
    private String quote;


    public Quote(long id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }


    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
