package com.naxian.Naxian_Fashion_Rest_Api.models.stores;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModelDTO;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class StoreDTO extends BaseModelDTO {
    private String StoreName;
    private String email;
    private String phoneNum;
    private String password;
}
