package com.itie.mystore;

import com.itie.mystore.v1.model.BannerEntity;
import com.itie.mystore.v1.service.BannerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MystoreApiJpaApplicationTests {

    @Autowired
    private BannerService bannerService;

    @Test
    void contextLoads() {
        BannerEntity banner = bannerService.getByName("test1");
        System.out.println(banner.getItems().size());
    }

}
