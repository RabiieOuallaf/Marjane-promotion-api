package com.marjane.marjanepromotionrestapi.Controllers.AdminOfRegion.Implementation;

import com.marjane.marjanepromotionrestapi.Controllers.AdminOfRegion.Interface.RegionAdminInterface;

import com.marjane.marjanepromotionrestapi.Entities.RegionAdmin;
import com.marjane.marjanepromotionrestapi.Services.AdminOfMarket.MarketAdminService;
import com.marjane.marjanepromotionrestapi.Services.AdminOfRegion.RegionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/region-admin")
public class RegionAdminController implements RegionAdminInterface {
    private final RegionAdminService regionAdminService;

    @Autowired
    public RegionAdminController(RegionAdminService regionAdminService, MarketAdminService marketAdminService) {
        this.regionAdminService = regionAdminService;
    }

    @Override
    public boolean authenticate(RegionAdmin regionAdmin) {
        return false;
    }

    @Override
    @PostMapping("/create")
    public RegionAdmin createRegionAdmin(@RequestBody RegionAdmin regionAdmin) {
        if(regionAdmin != null){
            return regionAdminService.create(regionAdmin);
        }
        return null;
    }

    @Override
    @GetMapping("/read")
    public Optional<RegionAdmin> readRegionAdmin(@RequestBody RegionAdmin regionAdmin) {
        if(regionAdmin != null){
            return regionAdminService.read(regionAdmin);
        }
        return null;
    }

    @Override
    @GetMapping("/read-all")
    public List<RegionAdmin> readAllRegionAdmins() {
        return regionAdminService.readAll();
    }

    @Override
    @PutMapping("/update")
    public RegionAdmin updateRegionAdmin(@RequestBody RegionAdmin regionAdmin) {
        if(regionAdmin != null){
            return regionAdminService.update(regionAdmin);
        }
        return null;
    }

    @Override
    @DeleteMapping("/delete")
    public void deleteRegionAdmin(@RequestBody RegionAdmin regionAdmin) {
        regionAdminService.delete(regionAdmin);
    }


}
