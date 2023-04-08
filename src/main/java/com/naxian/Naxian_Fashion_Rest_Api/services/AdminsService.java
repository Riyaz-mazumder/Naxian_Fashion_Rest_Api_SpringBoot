package com.naxian.Naxian_Fashion_Rest_Api.services;

import com.naxian.Naxian_Fashion_Rest_Api.dataRepoes.AdminsRepo;
import com.naxian.Naxian_Fashion_Rest_Api.models.admins.Admins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsService {
    @Autowired
    private AdminsRepo adminsRepo;

    public List<Admins> getAllAdmin(){
        return adminsRepo.findAll();
    }

    public void addAdmin(Admins admins){
        adminsRepo.save(admins);
    }

    public Admins getAdmin(Long id){
        return adminsRepo.findById(id).orElse(new Admins());
    }

    public void deleteAdmin(Long id){
        adminsRepo.deleteById(id);
    }
}
