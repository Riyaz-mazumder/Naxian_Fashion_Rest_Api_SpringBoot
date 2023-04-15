package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.Customers.CardRepo;
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


    @Autowired
    CardRepo cardRepo;


    @GetMapping("customers")
    public List<CustomersDTO> getAllCustomers_(){

        List<Customers>  customers =  customersService.getAllCustomers();
        List<CustomersDTO> customersDTO = new ArrayList<>();

        for (Customers customers1:customers){

            CustomersDTO customersDTO1 = new CustomersDTO();
            BeanUtils.copyProperties(customers1, customersDTO1);
            customersDTO.add(customersDTO1);
        }

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
//    @PatchMapping("customers/{id}")
//    public void PatchCustomer(@RequestBody CustomersDTO customersDTO, @PathVariable Long id){
//
//        Customers customers = customersService.getCustomer(id);
//        BeanUtils.copyProperties(customersDTO, customers);
//
//
//        customersService.setToCart_(customersDTO.getCard().get(0));
//    }

    @DeleteMapping("customers/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customersService.deleteCustomer(id);
    }



//    @PutMapping("customers/{id}")
//    public void addCard_(@RequestBody CustomersDTO customersDTO, @PathVariable(value = "id") Long id){
//
//        Customers customers = customersService.getCustomer(id);
////        BeanUtils.copyProperties(customersDTO, customers);
//        for (Card c:customersDTO.getCard()
//             ) {
//            c.setCustomers(customers);
//            cardRepo.save(c);
//        }
//
//    }

}
