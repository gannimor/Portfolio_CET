package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class webHelloController {

    private static final String template = "Hello , %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public webHello hello(@RequestParam(value="name", defaultValue="World") String name) {
        return new webHello(counter.incrementAndGet(),String.format(template, name));
    }




}
