package com.rest.backend.services;

import com.rest.backend.models.Queue;
import com.rest.backend.repositories.QueueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueHardcodedService {
    private final QueueRepository queueRepository;

    public QueueHardcodedService(QueueRepository queueRepository) {
        this.queueRepository = queueRepository;
    }

    public List<Queue> getAllQueues() {
        return queueRepository.findAll();
    }

    public void createQueue(Queue queue) {
        queueRepository.save(queue);
    }

    public void updateQueue(String email, Queue queue) {
        queue.setId(queueRepository.findQueueByEmail(email).getId());
        queueRepository.save(queue);
    }

    public void deleteQueue(String checkNumber) {
        queueRepository.deleteByCheckNumber(checkNumber);
    }
}
