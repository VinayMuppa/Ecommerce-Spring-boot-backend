package com.vinay.ecommerce.dto;

import com.vinay.ecommerce.entity.Address;
import com.vinay.ecommerce.entity.Customer;
import com.vinay.ecommerce.entity.Order;
import com.vinay.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}