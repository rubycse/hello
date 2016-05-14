package net.hello.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author lutfun
 * @since 3/28/16
 */

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello/show";
    }
}
