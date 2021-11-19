package HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @apiNote: For this example, open up your terminal, navigate to the folder
 * and then type in: curl -X GET localhost:8080/hello
 */
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello Spring Boot World!";
    }
}
