package com.hc.system.exception;


import com.hc.system.common.ResponseCode;

/**
 * 创建人是: zsg 创建时间: 2017/9/7 0007.
 */
public class AreaException extends RuntimeException {
    private Integer code;

    public AreaException(ResponseCode responseCode) {
        super(responseCode.getDesc());
        this.code = responseCode.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
