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


    @GetMapping
    public ResponseEntity<String> getGreeting(@RequestParam(defaultValue = "Day") String timeOfDay){
        return new ResponseEntity<>("Good " + timeOfDay + " "
                + new Greeting("Colin", "Daytime").getName() + "!",
                HttpStatus.OK);

    }
    @GetMapping(value = "/christmas")
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<>(new Celebration("Merry Christmas!").getMessage()  , HttpStatus.OK);
    }


}
