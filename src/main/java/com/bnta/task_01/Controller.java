package com.bnta.task_01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class Controller {

    private Greeting greeting;


    @GetMapping
    public ResponseEntity<String> getGreeting(@RequestParam(defaultValue = "Day") String timeOfDay){
        this.greeting = new Greeting("Colin", "Daytime");
        return new ResponseEntity<>("Good " + timeOfDay + " " + greeting.getName() + "!",
                HttpStatus.OK);

    }
}
