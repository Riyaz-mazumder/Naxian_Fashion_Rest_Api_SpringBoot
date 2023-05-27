package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.TrackRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.TrackModel;
import com.naxian.Naxian_Fashion_Rest_Api.models.products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingService {

    @Autowired
    private TrackRepo trackRepo;

    public TrackModel getById(Long id){

        return trackRepo.findById(id).orElse(new TrackModel());

    }

    public void addToTracking(TrackModel trackModel){
        trackRepo.save(trackModel);
    }
}
