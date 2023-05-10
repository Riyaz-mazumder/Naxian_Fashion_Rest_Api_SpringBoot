package com.naxian.Naxian_Fashion_Rest_Api.models.products;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModelDTO;
import lombok.Data;

@Data
public class ProductsDTO extends BaseModelDTO {
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
    private String storeName;
    private String couponCode;
}
