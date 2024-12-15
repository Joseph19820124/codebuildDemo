package com.nike.codebuildDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cashcards")
class CashCardController {
    private final CashCardRepository cashCardRepository;

    private CashCardController(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> getCashCard(@PathVariable Long requestedId) {
        return cashCardRepository.findById(requestedId).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
