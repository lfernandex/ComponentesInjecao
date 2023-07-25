package com.fernandes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandes.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShoppingService shoppingService;

    public double total(Order order){
        double tot = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);
        tot = tot + shoppingService.shipment(order);    
        return tot;
    }
    
}
