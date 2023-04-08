package com.naxian.Naxian_Fashion_Rest_Api.models.customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsReviews;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Customers extends BaseModel {

    private String name;
    private String email;
    private String gender;
    private LocalDate dob;
    private String password;

    @OneToMany(mappedBy = "customers")
    private List<Card> card;
    @OneToMany(mappedBy = "customers")
    private List<WishList> wishList;

    @OneToMany(mappedBy = "customers")
    private List<ProductsReviews> productsReviews;

}
