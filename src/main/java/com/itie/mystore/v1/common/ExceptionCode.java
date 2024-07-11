package com.itie.mystore.v1.common;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "itie.exception")
@PropertySource(value = "classpath:config/exception-code.properties")
@Data
@Component
public class ExceptionCode {
    private Map<Integer, String> codes = new HashMap<>();

    public String getMessage(int code){
        return codes.get(code);
    }
}
