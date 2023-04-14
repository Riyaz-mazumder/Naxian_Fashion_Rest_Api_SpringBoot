package com.naxian.Naxian_Fashion_Rest_Api.models.customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.orders.CustomersProductOrders;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsReviews;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "card_id", referencedColumnName = "id")
//    private List<Card> card;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "wish_list_id", referencedColumnName = "id")
//    private List<WishList> wishList;
//
////    customer product Order
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "products_reviews_id", referencedColumnName = "id")
//    private List<ProductsReviews> productsReviews;

}
