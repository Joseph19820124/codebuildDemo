package com.nike.codebuildDemo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> getCashCard(@PathVariable Long requestedId) {
        System.out.println(requestedId);
        if (requestedId.equals(99L)) {
            CashCard cashCard = new CashCard(99L, 123.45);
            return ResponseEntity.ok(cashCard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
