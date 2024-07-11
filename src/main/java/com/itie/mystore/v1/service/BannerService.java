package com.itie.mystore.v1.service;

import com.itie.mystore.v1.model.BannerEntity;

public interface BannerService {
    BannerEntity getByName(String name);
}
