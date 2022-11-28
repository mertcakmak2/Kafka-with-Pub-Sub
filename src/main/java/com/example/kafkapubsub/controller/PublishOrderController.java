package com.example.kafkapubsub.controller;

import com.example.kafkapubsub.model.Order;
import com.example.kafkapubsub.producer.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/publish")
public class PublishOrderController {

    public final OrderProducer orderProducer;

    @Autowired
    public PublishOrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @GetMapping(path = "")
    public String publishOrder() {
        for (int i = 0; i < 6; i++) {
            var order = new Order(i, new Date());
            orderProducer.produce(order);
        }
        return "published";
    }
}
