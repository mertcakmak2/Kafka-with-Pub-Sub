package com.example.kafkapubsub.consumer;


import com.example.kafkapubsub.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "order-topic", groupId = "group-id-1", properties = {"spring.json.value.default.type=com.example.kafkapubsub.model.Order"})
    public void consume1(Order order) {
        System.out.println(String.format("Consumer 1: %s", order.getOrderId()));
    }

    @KafkaListener(topics = "order-topic", groupId = "group-id-2", properties = {"spring.json.value.default.type=com.example.kafkapubsub.model.Order"})
    public void consume2(Order order) {
        System.out.println(String.format("Consumer 2: %s", order.getOrderId()));
    }

    @KafkaListener(topics = "order-topic", groupId = "group-id-3", properties = {"spring.json.value.default.type=com.example.kafkapubsub.model.Order"})
    public void consume3(Order order) {
        System.out.println(String.format("Consumer 3: %s", order.getOrderId()));
    }
}
