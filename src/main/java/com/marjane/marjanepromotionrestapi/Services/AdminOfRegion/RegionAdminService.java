package com.marjane.marjanepromotionrestapi.Services.AdminOfRegion;


import com.marjane.marjanepromotionrestapi.Entities.RegionAdmin;
import com.marjane.marjanepromotionrestapi.Repositories.RegionAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionAdminService {

    private final RegionAdminRepository regionAdminRepository;


    @Autowired
    public RegionAdminService(RegionAdminRepository regionAdminRepository) {
        this.regionAdminRepository = regionAdminRepository;
    }

    public RegionAdmin create(RegionAdmin regionAdmin) {
        return regionAdminRepository.save(regionAdmin);
    }
    public List<RegionAdmin> readAll(){
        return (List<RegionAdmin>) regionAdminRepository.findAll();
    }
    public Optional<RegionAdmin> read(RegionAdmin regionAdmin){
        return regionAdminRepository.findById(regionAdmin.getId());
    }
    public RegionAdmin update(RegionAdmin regionAdmin) {
        return regionAdminRepository.save(regionAdmin);
    }
    public void delete(RegionAdmin regionAdmin) {
        regionAdminRepository.delete(regionAdmin);
    }

}
