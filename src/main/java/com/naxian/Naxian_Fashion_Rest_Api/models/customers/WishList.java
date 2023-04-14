package com.naxian.Naxian_Fashion_Rest_Api.models.customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.ProductsBaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class WishList extends ProductsBaseModel {
//    @ManyToOne
//    @ToString.Exclude
//    @JoinColumn(name="wish_list_id")
//    private Customers customers;

    private Integer CustomerId;

}
