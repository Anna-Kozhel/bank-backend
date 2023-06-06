package com.rest.backend.repositories;

import com.rest.backend.models.Queue;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueRepository extends MongoRepository<Queue, String> {
    Queue findQueueByEmail(String email);
    void deleteByCheckNumber(String checkNumber);
}
