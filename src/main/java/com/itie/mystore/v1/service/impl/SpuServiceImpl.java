package com.itie.mystore.v1.service.impl;

import com.itie.mystore.v1.model.SpuEntity;
import com.itie.mystore.v1.persistence.SpuRepositery;
import com.itie.mystore.v1.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuRepositery spuRepositery;

    @Override
    public SpuEntity getSpu(Long id) {
        return spuRepositery.findOneById(id);
    }

    @Override
    public List<SpuEntity> getLatestPagingSpu() {
        return spuRepositery.findAll();
    }
}
