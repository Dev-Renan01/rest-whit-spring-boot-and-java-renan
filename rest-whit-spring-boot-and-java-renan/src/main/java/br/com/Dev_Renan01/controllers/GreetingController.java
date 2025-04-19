package br.com.Dev_Renan01.controllers;

import br.com.Dev_Renan01.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String tamplate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World!") 
    String name){

    return new Greeting(counter.incrementAndGet(), String.format(tamplate,name));
    //a cada requisiçao o id será maior
    }
}
