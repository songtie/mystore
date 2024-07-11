package com.itie.mystore.v1.controller;

import com.itie.mystore.v1.common.exception.NotFoundException;
import com.itie.mystore.v1.model.BannerEntity;
import com.itie.mystore.v1.service.BannerService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/banner/name/{name}")
    public BannerEntity getByName(@PathVariable @NotBlank String name){
        BannerEntity bannerEntity = bannerService.getByName(name);
        if(bannerEntity == null){
            throw new NotFoundException(30001);
        }
        return bannerEntity;
    }
}
