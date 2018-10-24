package io.pivotal.sample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {
    @GetMapping(path = "/ping")
    public String ping() {
        return "<h1>PONG!</h1>";
    }

    @GetMapping(path = "/")
    public
}
