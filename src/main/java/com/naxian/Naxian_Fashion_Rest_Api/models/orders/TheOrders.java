package com.naxian.Naxian_Fashion_Rest_Api.models.orders;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.ProductsBaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TheOrders extends ProductsBaseModel{
    @ManyToOne(fetch = FetchType.EAGER)
    private CustomersProductOrders customersProductOrders;
}
