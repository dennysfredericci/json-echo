package com.devoctans.jsonecho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    class EchoController {

        @GetMapping("/echo")
        public ResponseEntity<Void> get(@RequestParam(defaultValue = "200") Integer status) {
            return ResponseEntity.status(status)
                    .build();
        }

    }

}
