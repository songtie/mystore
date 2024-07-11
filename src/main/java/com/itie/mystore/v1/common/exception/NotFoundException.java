package com.itie.mystore.v1.common.exception;

public class NotFoundException extends HttpException{
    public NotFoundException(int code){
        this.code = code;
        this.httpStateCode = 404;
    }
}
