package com.marjane.marjanepromotionrestapi.Repositories;

import com.marjane.marjanepromotionrestapi.Entities.CentralAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentralAdminRepository extends JpaRepository<CentralAdmin, Integer>  {
    CentralAdminRepository findByEmail(String email);
}
