package com.naxian.Naxian_Fashion_Rest_Api.models.customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.ProductsBaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class WishList extends ProductsBaseModel {
    @ManyToOne
    private Customers customers;
}
