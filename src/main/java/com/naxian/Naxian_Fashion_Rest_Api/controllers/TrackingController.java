package com.naxian.Naxian_Fashion_Rest_Api.controllers;


import com.naxian.Naxian_Fashion_Rest_Api.models.TrackModel;
import com.naxian.Naxian_Fashion_Rest_Api.services.EmailService;
import com.naxian.Naxian_Fashion_Rest_Api.services.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class TrackingController {

    @Autowired
    private TrackingService trackingService;


    @Autowired
    private EmailService emailService;

    @GetMapping("track/{id}")
    public TrackModel getAllByIdTrackingProduct(@PathVariable Long id){
        return trackingService.getById(id);
    }

    @PostMapping("track")
    public void saveTrackingByProducts(@RequestBody TrackModel trackModel){
      trackingService.addToTracking(trackModel);
    }


}
