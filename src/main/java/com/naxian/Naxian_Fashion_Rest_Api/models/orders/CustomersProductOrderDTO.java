package com.naxian.Naxian_Fashion_Rest_Api.models.orders;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModelDTO;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CustomersProductOrderDTO extends BaseModelDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private int amount;
    private List<TheOrders> theOrders;
    private Integer customerId;
    private String paymentMethod;
    private String bikashNo;
    private String TrxID;
    private boolean isApproved;
}
