package com.itie.mystore.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    private Date createTime;
    private Date updateTime;
    @JsonIgnore
    private Date deleteTime;
}
