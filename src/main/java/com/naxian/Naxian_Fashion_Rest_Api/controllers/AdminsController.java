package com.naxian.Naxian_Fashion_Rest_Api.controllers;

import com.naxian.Naxian_Fashion_Rest_Api.models.admins.Admins;
import com.naxian.Naxian_Fashion_Rest_Api.models.admins.AdminsDTO;
import com.naxian.Naxian_Fashion_Rest_Api.services.AdminsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class AdminsController {

    @Autowired
    private AdminsService adminsService;

    @GetMapping("admins")
    public List<AdminsDTO> getAllAdmins_(){

        List<Admins> allAdmins = adminsService.getAllAdmin();
        List<AdminsDTO> adminsDTO = new ArrayList<>();

        BeanUtils.copyProperties(allAdmins, adminsDTO);
        return adminsDTO;
    }

    @PostMapping("admins")
    public void addAdmin_(@RequestBody AdminsDTO adminsDTO){

        Admins admins = new Admins();
        BeanUtils.copyProperties(adminsDTO, admins);

        adminsService.addAdmin(admins);
    }

    @GetMapping("admins/{id}")
    public AdminsDTO getById_(@PathVariable Long id){

        Admins admins = adminsService.getAdmin(id);
        AdminsDTO adminsDTO = new AdminsDTO();

        BeanUtils.copyProperties(admins, adminsDTO);
        return adminsDTO;
    }

    @PutMapping("admins")
    public void updateAdmin_(AdminsDTO adminsDTO){
        Admins admins = new Admins();
        BeanUtils.copyProperties(adminsDTO, admins);
       adminsService.addAdmin(admins);
    }

    @DeleteMapping("admins/{id}")
    public void deleteAdmin_(@PathVariable Long id){
        adminsService.deleteAdmin(id);
    }

}
