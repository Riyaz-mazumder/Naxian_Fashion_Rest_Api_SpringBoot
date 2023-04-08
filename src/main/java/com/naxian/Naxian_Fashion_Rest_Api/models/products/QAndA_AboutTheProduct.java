package com.naxian.Naxian_Fashion_Rest_Api.models.products;

import com.naxian.Naxian_Fashion_Rest_Api.models.baseModels.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class QAndA_AboutTheProduct extends BaseModel {

    private String question;
    private String answer;

    @ManyToOne
    private Products products;

}
