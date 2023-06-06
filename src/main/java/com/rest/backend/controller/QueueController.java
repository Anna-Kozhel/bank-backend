package com.rest.backend.controller;

import com.rest.backend.models.Queue;
import com.rest.backend.services.QueueHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class QueueController {
    private final QueueHardcodedService queueHardcodedService;

    @Autowired
    public QueueController(QueueHardcodedService queueHardcodedService) {
        this.queueHardcodedService = queueHardcodedService;
    }

    @GetMapping("/users/queues")
    public List<Queue> getAllQueues() {
        return queueHardcodedService.getAllQueues();
    }

    @PostMapping("/user/queue/add")
    public ResponseEntity<Queue> addContact(@RequestBody Queue queue) {
        queueHardcodedService.createQueue(queue);
        return new ResponseEntity<>(queue, HttpStatus.OK);
    }

    @PutMapping("/user/queue/update/{email}")
    public ResponseEntity<Queue> updateContact(@PathVariable String email, @RequestBody Queue queue) {
        queueHardcodedService.updateQueue(email, queue);
        return new ResponseEntity<>(queue, HttpStatus.OK);
    }

    @DeleteMapping("/user/queue/{checkNumber}")
    public ResponseEntity<Void> deleteContact(@PathVariable String checkNumber) {
        queueHardcodedService.deleteQueue(checkNumber);
        return ResponseEntity.noContent().build();
    }
}
