package com.naxian.Naxian_Fashion_Rest_Api.models.baseModels;

import com.naxian.Naxian_Fashion_Rest_Api.models.products.ProductsReviews;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.QAndA_AboutTheProduct;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@MappedSuperclass
public class ProductsBaseModel extends BaseModel{
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

}
