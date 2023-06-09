package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.OrdersRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepo ordersRepo;

    public List<CustomersProductOrders> getAllApprovedOrders(){
        return ordersRepo.findAllApprovedOrdersList();
    }

    public List<CustomersProductOrders> getAllOrders(){
        return ordersRepo.findAll();
    }

    public List<CustomersProductOrders> getAllUnApprovedOrders(){
        return ordersRepo.findByIsApprovedFalse();
    }

    public CustomersProductOrders getOrder(Long id){
        return ordersRepo.findById(id).orElse(new CustomersProductOrders());
    }
    public void setOrder(CustomersProductOrders customersProductOrders){
        ordersRepo.save(customersProductOrders);
    }

    public void  deleteOrder(Long id){
        ordersRepo.deleteById(id);
    }

    public int setApproved_(Long id){
       return ordersRepo.setApproved(id);
    }
}
