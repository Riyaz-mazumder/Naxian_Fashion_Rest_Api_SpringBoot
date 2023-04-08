package com.naxian.Naxian_Fashion_Rest_Api.models.products;


import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.stores.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products extends BaseModel {
    private String name;
    private int regularPrice;
    private int offerPrice;
    private String description;
    private int quantity;
    private String category;
    private String subCate;
    private String manufacture;
    private String productSize;
    private String productColor;
    private String weight;
    private String productImage_1;
    private String productImage_2;
    private String productImage_3;

    @ManyToOne
    private Store store;

    @OneToMany(mappedBy = "products")
    private List<ProductsReviews> productsReviews;

    @OneToMany(mappedBy = "products")
    private List<QAndA_AboutTheProduct> qAndA_aboutTheProduct;
}
