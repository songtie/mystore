package com.itie.mystore.v1.common;

import lombok.Data;

@Data
public class CommonResponse {
    private int code;
    private String message;
    private String url;

    public CommonResponse(int code, String message, String url) {
        this.code = code;
        this.message = message;
        this.url = url;
    }
}
