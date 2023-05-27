package com.naxian.Naxian_Fashion_Rest_Api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackModel {
    @Id
    private Long id;

    private String trackingNum;

    private boolean confirmed;

    private boolean pickedUp;
    private boolean inTransit;
    private boolean outForDelivery;

    private boolean delivered;
}
