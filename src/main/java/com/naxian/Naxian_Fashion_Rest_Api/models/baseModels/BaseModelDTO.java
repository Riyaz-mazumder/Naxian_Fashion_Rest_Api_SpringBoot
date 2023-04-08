package com.naxian.Naxian_Fashion_Rest_Api.models.baseModels;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;

@Data
public class BaseModelDTO {
    private long id;
    private LocalDateTime createdDateTime;
    private String createdBy;
    private LocalDateTime updatedDateTime;
    private String updatedBy;
}
