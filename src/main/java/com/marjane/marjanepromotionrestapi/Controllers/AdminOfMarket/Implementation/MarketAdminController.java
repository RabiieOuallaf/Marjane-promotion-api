package com.marjane.marjanepromotionrestapi.Controllers.AdminOfMarket.Implementation;

import com.marjane.marjanepromotionrestapi.Controllers.AdminOfMarket.Interface.MarketAdminInterface;
import com.marjane.marjanepromotionrestapi.Entities.MarketAdmin;
import com.marjane.marjanepromotionrestapi.Services.AdminOfMarket.MarketAdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/market-admin")
public class MarketAdminController implements MarketAdminInterface {
    private final MarketAdminService marketAdminService;

    public MarketAdminController(MarketAdminService marketAdminService) {
        this.marketAdminService = marketAdminService;
    }

    @Override
    @PostMapping("/create")

    public MarketAdmin createMarketAdmin(@RequestBody MarketAdmin marketAdmin) {
        if(marketAdmin != null){
            return marketAdminService.create(marketAdmin);
        }
        return null;
    }
    @Override
    @GetMapping("/read")

    public Optional<MarketAdmin> readMarketAdmin(@RequestBody MarketAdmin marketAdmin) {
        if(marketAdmin != null){
            return marketAdminService.read(marketAdmin);
        }
        return null;
    }

    @Override
    @GetMapping("/read-all")

    public List<MarketAdmin> readAllMarketAdmins() {
        return marketAdminService.readAll();
    }

    @Override
    @PutMapping("/update")

    public MarketAdmin updateMarketAdmin(@RequestBody MarketAdmin marketAdmin) {
        if(marketAdmin != null){
            return marketAdminService.update(marketAdmin);
        }
        return null;
    }

    @Override
    @DeleteMapping("/delete")

    public void deleteMarketAdmin(@RequestBody MarketAdmin marketAdmin) {
        marketAdminService.delete(marketAdmin);
    }
}
