package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.CustomersDTO;
import com.naxian.Naxian_Fashion_Rest_Api.services.CustomersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @GetMapping("customers")
    public List<CustomersDTO> getAllCustomers_(){

        List<Customers>  customers =  customersService.getAllCustomers();
        List<CustomersDTO> customersDTO = new ArrayList<>();


        BeanUtils.copyProperties(customers, customersDTO);
        return customersDTO;
    }

    @PostMapping("customers")
    public void addCustomer_(@RequestBody CustomersDTO customersDTO){

        Customers customers = new Customers();
        BeanUtils.copyProperties(customersDTO, customers);

        customersService.addCustomer(customers);
    }

    @GetMapping("customers/{id}")
    public CustomersDTO getById_(@PathVariable Long id){

        Customers customers = customersService.getCustomer(id);
        CustomersDTO customersDTO = new CustomersDTO();
        BeanUtils.copyProperties(customers, customersDTO);

        return customersDTO;
    }

    @PutMapping("customers")
    public void updateCustomer(@RequestBody CustomersDTO customersDTO){
        Customers customers = new Customers();
        BeanUtils.copyProperties(customersDTO, customers);

        customersService.addCustomer(customers);
    }

    @DeleteMapping("customers/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customersService.deleteCustomer(id);
    }


}
