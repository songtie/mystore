package com.itie.mystore.v1.controller;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.itie.mystore.v1.common.exception.NotFoundException;
import com.itie.mystore.v1.model.BannerEntity;
import com.itie.mystore.v1.model.SpuEntity;
import com.itie.mystore.v1.service.BannerService;
import com.itie.mystore.v1.service.SpuService;
import com.itie.mystore.v1.vo.SpuSimpleVO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/spu")
@Validated
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/id/{id}/detail")
    public SpuEntity getDetail(@PathVariable @Positive Long id){
        SpuEntity spuEntity = spuService.getSpu(id);

        if(spuEntity == null){
            throw new NotFoundException(30002);
        }
        return spuEntity;
    }

    @GetMapping("/latest")
    public List<SpuSimpleVO> getLatestSpuList(){
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        List<SpuSimpleVO> spuSimpleVOList = new ArrayList<>();

        List<SpuEntity> spuEntityList = spuService.getLatestPagingSpu();

        spuEntityList.forEach(spuEntity -> {
            SpuSimpleVO spuSimpleVO = mapper.map(spuEntity, SpuSimpleVO.class);
            spuSimpleVOList.add(spuSimpleVO);
        });

        return spuSimpleVOList;
    }
}
