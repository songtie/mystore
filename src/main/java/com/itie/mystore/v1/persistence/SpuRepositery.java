package com.itie.mystore.v1.persistence;

import com.itie.mystore.v1.model.BannerEntity;
import com.itie.mystore.v1.model.SpuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpuRepositery extends JpaRepository<SpuEntity, Long> {
    SpuEntity findOneById(Long id);
}
