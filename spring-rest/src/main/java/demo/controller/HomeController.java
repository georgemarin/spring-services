package demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${welcome.message}")
    String welcomeMessage;

    @RequestMapping("/home")
    public String home() {
        return welcomeMessage;
    }
}
