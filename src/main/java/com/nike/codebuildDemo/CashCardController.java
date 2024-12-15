package com.nike.codebuildDemo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<String> getCashCard(@PathVariable int requestedId) {
        System.out.println(requestedId);
        return ResponseEntity.ok("{}");
    }
}
