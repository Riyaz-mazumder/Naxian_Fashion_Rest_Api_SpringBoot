package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrderDTO;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsDTO;
import com.naxian.Naxian_Fashion_Rest_Api.services.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class OrdersController {

   @Autowired
    private OrdersService ordersService;

    @GetMapping("orders/unApproved")
    public List<CustomersProductOrderDTO> getAllUnApprovedOrders_(){

        List<CustomersProductOrders> customersProductOrders =  ordersService.getAllUnApprovedOrders();
        List<CustomersProductOrderDTO> allCustomersProductOrdersDTO = new ArrayList<>();

       for(CustomersProductOrders p:customersProductOrders){
           CustomersProductOrderDTO customersProductOrderDTO = new CustomersProductOrderDTO();
           BeanUtils.copyProperties(p, customersProductOrderDTO);

           allCustomersProductOrdersDTO.add(customersProductOrderDTO);
       }

        return allCustomersProductOrdersDTO;
    }

   @GetMapping("orders/approved")
   public List<CustomersProductOrderDTO> getAllApprovedOrders_(){
       List<CustomersProductOrders> customersProductOrders =  ordersService.getAllApprovedOrders();
       List<CustomersProductOrderDTO> customersProductOrdersDTO = new ArrayList<>();
       BeanUtils.copyProperties(customersProductOrders, customersProductOrdersDTO);
       return customersProductOrdersDTO ;
   }

   @GetMapping("orders/{id}")
    public CustomersProductOrderDTO getById_(@PathVariable Long id){

        CustomersProductOrders customersProductOrders =  ordersService.getOrder(id);
        CustomersProductOrderDTO customersProductOrderDTO = new CustomersProductOrderDTO();
        BeanUtils.copyProperties(customersProductOrders, customersProductOrderDTO);
       return customersProductOrderDTO;

    }

    @PostMapping("orders")
    public void serOrder_(@RequestBody CustomersProductOrderDTO customersProductOrderDTO){

        CustomersProductOrders customersProductOrders = new CustomersProductOrders();
        BeanUtils.copyProperties(customersProductOrderDTO, customersProductOrders);

        ordersService.setOrder(customersProductOrders);
    }

    @PutMapping("orders")
    public void editOrder_(@RequestBody CustomersProductOrderDTO customersProductOrderDTO){

        CustomersProductOrders customersProductOrders = new CustomersProductOrders();
        BeanUtils.copyProperties(customersProductOrderDTO, customersProductOrders);

        ordersService.setOrder(customersProductOrders);
    }
    @DeleteMapping("orders/delete/{id}")
    public void deleteTheOrder(@PathVariable Long id){
       ordersService.deleteOrder(id);
    }
}
