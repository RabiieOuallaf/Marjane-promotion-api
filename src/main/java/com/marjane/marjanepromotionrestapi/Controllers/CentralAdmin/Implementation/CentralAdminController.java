package com.marjane.marjanepromotionrestapi.Controllers.CentralAdmin.Implementation;

import com.marjane.marjanepromotionrestapi.Controllers.CentralAdmin.Interface.CentralAdminInterface;
import com.marjane.marjanepromotionrestapi.Entities.CentralAdmin;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class CentralAdminController implements CentralAdminInterface {

    @Override
    public boolean authenticate(CentralAdmin centralAdmin) {
        return false;
    }


}
