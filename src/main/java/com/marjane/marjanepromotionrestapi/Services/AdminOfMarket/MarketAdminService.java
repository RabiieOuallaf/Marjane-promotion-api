package com.marjane.marjanepromotionrestapi.Services.AdminOfMarket;

import com.marjane.marjanepromotionrestapi.Entities.MarketAdmin;
import com.marjane.marjanepromotionrestapi.Repositories.MarketAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarketAdminService {
    private final MarketAdminRepository marketAdminRepository;

    @Autowired
    public MarketAdminService(MarketAdminRepository marketAdminRepository) {
        this.marketAdminRepository = marketAdminRepository;
    }

    public MarketAdmin create(MarketAdmin marketAdmin) {
        return marketAdminRepository.save(marketAdmin);
    }
    public List<MarketAdmin> readAll(){
        return (List<MarketAdmin>) marketAdminRepository.findAll();
    }
    public Optional<MarketAdmin> read(MarketAdmin marketAdmin){
        return marketAdminRepository.findById(marketAdmin.getId());
    }
    public MarketAdmin update(MarketAdmin marketAdmin) {
        return marketAdminRepository.save(marketAdmin);
    }
    public void delete(MarketAdmin marketAdmin) {
        marketAdminRepository.delete(marketAdmin);
    }

}
