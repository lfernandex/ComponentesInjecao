package com.fernandes.services;



import org.springframework.stereotype.Service;

import com.fernandes.entities.Order;

@Service
public class ShoppingService {
    
    public double shipment(Order order){
        if (order.getBasic() >= 200.0){
            return 0.0;
        }
        if (order.getBasic() >= 100.0) {
            return 12.0;
            
        } else {
            return 20.0;
        }
        
    }
}
