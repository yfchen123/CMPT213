package QuotesPackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuoteRepoController {
    private List<Quote> quoteArrayList = new ArrayList<>();
    private AtomicLong nextID = new AtomicLong();

    @GetMapping("/name")
    public String getName(){
        return "Yun Fei Chen";
    }

    @GetMapping("/{id}")
    public Quote getAQuote(@PathVariable("id") long quoteId){
        for(Quote quote : quoteArrayList){
            if(quote.getId() == quoteId){
                return quote;
            }
        }
        return new Quote(-1, "No one", "Doesn't exist!");
    }
}
