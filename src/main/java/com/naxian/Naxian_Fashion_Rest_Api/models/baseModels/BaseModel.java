package com.naxian.Naxian_Fashion_Rest_Api.models.baseModels;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseModel implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @CreationTimestamp
    private LocalDateTime createdDateTime;
    private String createdBy;
    @CreationTimestamp
    private LocalDateTime updatedDateTime;
    @Nullable
    private String updatedBy;
    @Nullable
    private boolean isActive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseModel baseModel = (BaseModel) o;
        return id == baseModel.id && isActive == baseModel.isActive && Objects.equals(createdDateTime, baseModel.createdDateTime) && Objects.equals(createdBy, baseModel.createdBy) && Objects.equals(updatedDateTime, baseModel.updatedDateTime) && Objects.equals(updatedBy, baseModel.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDateTime, createdBy, updatedDateTime, updatedBy, isActive);
    }
}
