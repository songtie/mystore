package com.itie.mystore.v1.common;

import com.itie.mystore.v1.common.exception.HttpException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @Autowired
    private ExceptionCode exceptionCode;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResponse exceptionHandler(Exception e , HttpServletRequest request){
        String requestURL = request.getRequestURI();
        String method = request.getMethod();
        e.printStackTrace();
        CommonResponse response = new CommonResponse(1,"服务器异常", method + " " + requestURL);
        return response;
    }

    @ExceptionHandler(HttpException.class)
    public ResponseEntity<CommonResponse> httpExceptionHandler(HttpException e, HttpServletRequest request){
        String requestURL = request.getRequestURI();
        String method = request.getMethod();
        CommonResponse response = new CommonResponse(e.getCode(),exceptionCode.getMessage(e.getCode()), method + " " + requestURL);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStateCode());
        ResponseEntity<CommonResponse> responseEntity = new ResponseEntity<>(response, httpHeaders, httpStatus);

        return responseEntity;
    }

}
