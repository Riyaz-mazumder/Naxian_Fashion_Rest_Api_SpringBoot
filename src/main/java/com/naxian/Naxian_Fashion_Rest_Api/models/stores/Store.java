package com.naxian.Naxian_Fashion_Rest_Api.models.stores;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Store extends BaseModel {
    private String StoreName;
    private String email;
    private String phoneNum;
    private String password;
    private String isApproved;

//    @OneToMany(mappedBy = "store")
//    private List<Products> products;


}
