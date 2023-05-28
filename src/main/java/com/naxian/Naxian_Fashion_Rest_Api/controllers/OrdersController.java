package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.models.EmailRequest;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrderDTO;
import com.naxian.Naxian_Fashion_Rest_Api.services.EmailService;
import com.naxian.Naxian_Fashion_Rest_Api.services.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class OrdersController {

   @Autowired
    private OrdersService ordersService;

   @Autowired
  private EmailService emailService;


    @GetMapping("orders/unapproved")
    public List<CustomersProductOrders> getAllUnApprovedOrders_(){
        return ordersService.getAllUnApprovedOrders();
    }

   @GetMapping("orders/approved")
   public List<CustomersProductOrderDTO> getAllApprovedOrders_(){
       List<CustomersProductOrders> customersProductOrders =  ordersService.getAllApprovedOrders();
       List<CustomersProductOrderDTO> customersProductOrdersDTO = new ArrayList<>();
       BeanUtils.copyProperties(customersProductOrders, customersProductOrdersDTO);
       return customersProductOrdersDTO ;
   }

    @GetMapping("orders")
    public List<CustomersProductOrders> getAllOrders_(){

        return ordersService.getAllOrders();
    }

//        List<CustomersProductOrders> customersProductOrders =  ordersService.getAllOrders();
//        List<CustomersProductOrderDTO> customersProductOrdersDTO = new ArrayList<>();
//        BeanUtils.copyProperties(customersProductOrders, customersProductOrdersDTO);
//        return customersProductOrdersDTO ;

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

        emailService.sendEmail(customersProductOrders.getEmail(), "Naxian Fashion purchase", " Thank You " + customersProductOrders.getFirstName() + customersProductOrders.getLastName() +" Sir, For Placing an order. We will get back to you soon. -Naxian Fashion Team");

    }

//    @PostMapping("send-email")
//    public void sendEmail(@RequestBody EmailRequest emailRequest) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(emailRequest.getEmail());
//        message.setSubject(emailRequest.getSubject());
//        message.setText(emailRequest.getBody());
//        emailSender.send(message);
//    }

    @PutMapping("orders")
    public void editOrder_(@RequestBody CustomersProductOrderDTO customersProductOrderDTO){

        CustomersProductOrders customersProductOrders = new CustomersProductOrders();
        BeanUtils.copyProperties(customersProductOrderDTO, customersProductOrders);

        ordersService.setOrder(customersProductOrders);
    }

    @PutMapping("orders/makeApprove/{id}")
    public int makeApprove(@PathVariable Long id){
      return ordersService.setApproved_(id);
    }

    @DeleteMapping("orders/delete/{id}")
    public void deleteTheOrder(@PathVariable Long id){
       ordersService.deleteOrder(id);
    }
}
