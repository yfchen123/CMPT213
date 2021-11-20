package QuotesPackage;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuoteRepoController {
    private List<Quote> quoteArrayList = new ArrayList<>();
    private AtomicLong nextID = new AtomicLong();

    /**
     * @apiNote : open command prompt and use curl -X GET localhost:8080/name to use
     * @return the name
     */
    @GetMapping("/name")
    public String getName(){
        return "Yun Fei Chen";
    }


    /**
     * @apiNote: open command prompt and use curl -X GET localhost:8080/# to use.
     * @param quoteId
     * @return the quote if it exists if not, just return a new quote with id of -1, author of no one, and quote value
     * of Doesn't exist!
     */
    @GetMapping("/{id}")
    public Quote getAQuote(@PathVariable("id") long quoteId){
        for(Quote quote : quoteArrayList){
            if(quote.getId() == quoteId){
                return quote;
            }
        }
        return new Quote(-1, "No one", "Doesn't exist!");
    }

    /**
     * @apiNote The terminal command: curl -H "Content-Type: application/json" -X POST -d
     * "{\"author\": \"Victor\", \"quote\": \"We have class today!\"}" localhost:8080/addAQuote
     * Should work, however for some magical reason: a {"timestamp":"2021-11-20T03:20:55.452+00:00","status":405,
     * "error":"Method Not Allowed","path":"/addAQuote"} error is reported.
     * @param myQuote
     * @return
     */
    @PostMapping
    public Quote addAQuote(@RequestBody Quote myQuote){
        myQuote.setId(nextID.getAndIncrement());
        quoteArrayList.add(myQuote);
        return myQuote;
    }
}
