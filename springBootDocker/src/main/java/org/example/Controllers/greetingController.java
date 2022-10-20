package org.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

    @RequestMapping("/greeting")
    public String greeting(){
        return "<h1>I am running on Docker</h1";
    }
}
