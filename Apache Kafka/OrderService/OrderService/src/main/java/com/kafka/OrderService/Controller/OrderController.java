package com.kafka.OrderService.Controller;

import com.kafka.BaseDomain.DTO.Order;
import com.kafka.BaseDomain.DTO.OrderEvent;
import com.kafka.OrderService.Kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
    OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/orders")
    public  String placeOrder(@RequestBody Order order){
        order.setOrderId(UUID.randomUUID().toString());
        OrderEvent orderEvent=new OrderEvent();
        orderEvent.setStatusOrder("PENDING");
        orderEvent.setMessage("OrderStatus is in pendingState");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);
        return "Order Place Successfully";
    }
}
