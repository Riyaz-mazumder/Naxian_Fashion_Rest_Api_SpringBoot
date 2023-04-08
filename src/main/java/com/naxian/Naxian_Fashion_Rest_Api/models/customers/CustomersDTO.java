package com.naxian.Naxian_Fashion_Rest_Api.models.customers;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModelDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CustomersDTO extends BaseModelDTO {
    private String name;
    private String email;
    private String gender;
    private LocalDate dob;
    private List<Card> card;
    private List<WishList> wishList;
}
