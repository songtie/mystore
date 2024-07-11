package com.itie.mystore.v1.persistence;

import com.itie.mystore.v1.model.BannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepositery extends JpaRepository<BannerEntity, Long> {
    BannerEntity findOneById(Long id);
    BannerEntity findOneBannerByName(String name);
}
