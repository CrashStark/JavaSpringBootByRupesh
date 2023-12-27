package com.kafka.BaseDomain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String orderName;
    private  int quantity;
    private double price;
}
