package com.marjane.marjanepromotionrestapi.Controllers.AdminOfMarket.Interface;

import com.marjane.marjanepromotionrestapi.Entities.MarketAdmin;

import java.util.List;
import java.util.Optional;

public interface MarketAdminInterface {
    // == Market admin == //
    public MarketAdmin createMarketAdmin(MarketAdmin marketAdmin);
    public Optional<MarketAdmin> readMarketAdmin(MarketAdmin marketAdmin);
    public List<MarketAdmin> readAllMarketAdmins();
    public MarketAdmin updateMarketAdmin(MarketAdmin marketAdmin);
    public void deleteMarketAdmin(MarketAdmin marketAdmin);
}
