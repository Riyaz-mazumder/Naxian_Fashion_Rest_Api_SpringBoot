package com.naxian.Naxian_Fashion_Rest_Api.models.orders;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    @OneToMany(mappedBy = "customersProductOrders")
    private List<TheOrders> theOrders;

    private Long customerId;

    private String paymentMethod;
    private String bikashNo;
    private String TrxID;
    private boolean isApproved;

}
