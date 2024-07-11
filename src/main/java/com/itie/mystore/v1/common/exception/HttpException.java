package com.itie.mystore.v1.common.exception;

import lombok.Data;

@Data
public class HttpException extends RuntimeException{
    protected int code;
    protected int httpStateCode;

}
