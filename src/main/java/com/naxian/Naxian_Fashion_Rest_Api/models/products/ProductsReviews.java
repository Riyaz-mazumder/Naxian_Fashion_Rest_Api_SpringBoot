package com.naxian.Naxian_Fashion_Rest_Api.models.products;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;


@Entity
@Data
public class ProductsReviews extends BaseModel {
 private String Star;

// @ManyToOne
// @ToString.Exclude
// @JoinColumn(name="products_reviews_id")
// private Customers customers;
//
// @ManyToOne
// private Products products;

 private String imageUrl1;
 private String imageUrl2;
 private String imageUrl3;
 private String imageUrl4;
 private String imageUrl5;
 private String imageUrl6;

// 1000 letter description
 private String description;

 private String feelingsAboutTheProductByEmojis;

 private String rateYourRiderByStar;
}
