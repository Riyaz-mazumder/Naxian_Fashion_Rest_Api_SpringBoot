package com.naxian.Naxian_Fashion_Rest_Api.models.orders;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomersProductOrders extends BaseModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private int amount;
//
//    @OneToMany(mappedBy = "customersProductOrders", cascade = CascadeType.ALL)
//    private List<TheOrders> theOrders;

    @Column(length = 500)
    private String products;

//    getting null
    private Integer customerId;

    private String paymentMethod;
    private String bikashNo;
    private String TrxID;
    private boolean isApproved;

}
