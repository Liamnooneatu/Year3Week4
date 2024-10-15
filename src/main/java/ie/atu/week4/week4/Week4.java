package ie.atu.week4.week4;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController

public class Week4 {
    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
}
