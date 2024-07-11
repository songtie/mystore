package com.itie.mystore.v1.service.impl;

import com.itie.mystore.v1.model.BannerEntity;
import com.itie.mystore.v1.persistence.BannerRepositery;
import com.itie.mystore.v1.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepositery bannerRepositery;

    @Override
    public BannerEntity getByName(String name) {
        return bannerRepositery.findOneBannerByName(name);
    }
}
