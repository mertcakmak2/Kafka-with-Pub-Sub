package com.example.kafkapubsub.consumer;

import com.example.kafkapubsub.model.Order;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public interface Consumer {
    void consume1(@Payload Order order, Acknowledgment ack);
    void consume2(@Payload Order order, Acknowledgment ack);
    void consume3(@Payload Order order, Acknowledgment ack);
}
