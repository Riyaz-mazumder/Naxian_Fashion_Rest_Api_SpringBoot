package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.Customers.CustomersRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Card;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {
    @Autowired
    private CustomersRepo customersRepo;

    public List<Customers> getAllCustomers(){
        return customersRepo.findAll();
    }
    public void addCustomer(Customers customers){
        customersRepo.save(customers);
    }
    public Customers getCustomer(Long id){
        return customersRepo.findById(id).orElse(new Customers());
    }

    public void deleteCustomer(Long id){
        customersRepo.deleteById(id);
    }

    public void setToCart_(Card card){
        customersRepo.setToCart(card);
    }

}
