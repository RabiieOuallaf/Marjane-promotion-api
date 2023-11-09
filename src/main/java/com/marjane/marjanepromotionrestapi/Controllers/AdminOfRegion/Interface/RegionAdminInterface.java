package com.marjane.marjanepromotionrestapi.Controllers.AdminOfRegion.Interface;

import com.marjane.marjanepromotionrestapi.Entities.RegionAdmin;

import java.util.List;
import java.util.Optional;

public interface RegionAdminInterface {
    // == Region admin == //
    public boolean authenticate(RegionAdmin admin);
    public RegionAdmin createRegionAdmin(RegionAdmin regionAdmin);
    public Optional<RegionAdmin> readRegionAdmin(RegionAdmin regionAdmin);
    public List<RegionAdmin> readAllRegionAdmins();
    public RegionAdmin updateRegionAdmin(RegionAdmin regionAdmin);
    public void deleteRegionAdmin(RegionAdmin regionAdmin);
}
