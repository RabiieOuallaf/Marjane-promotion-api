package com.marjane.marjanepromotionrestapi.Repositories;

import com.marjane.marjanepromotionrestapi.Entities.RegionAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface RegionAdminRepository extends CrudRepository<RegionAdmin, Integer> {


}
