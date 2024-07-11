package com.itie.mystore.v1.common.exception;

public class ForbiddenException extends HttpException{
    public ForbiddenException(int code){
        this.code = code;
        this.httpStateCode = 403;
    }
}
