package com.itie.mystore.v1.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpuSimpleVO {
    private Long id;
    private String title;
    private String subtitle;
    private String img;
    private String forThemeImg;
    private String price;
    private String discountPrice;
    private String description;
    private String tags;
    private Long sketchSpecId;
}
