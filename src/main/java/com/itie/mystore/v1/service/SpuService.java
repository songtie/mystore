package com.itie.mystore.v1.service;

import com.itie.mystore.v1.model.SpuEntity;

import java.util.List;

public interface SpuService {
    SpuEntity getSpu(Long id);

    List<SpuEntity> getLatestPagingSpu();
}
