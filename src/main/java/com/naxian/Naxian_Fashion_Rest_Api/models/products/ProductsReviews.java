package com.naxian.Naxian_Fashion_Rest_Api.models.products;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.customers.Customers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class ProductsReviews extends BaseModel {
 private String Star;

 @ManyToOne
 private Customers customers;

 @ManyToOne
 private Products products;

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
