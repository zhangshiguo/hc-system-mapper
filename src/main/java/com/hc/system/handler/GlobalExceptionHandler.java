package com.hc.system.handler;

import com.hc.system.common.ServerResponse;
import com.hc.system.exception.AreaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 创建人是: zsg 创建时间: 2018/2/7 0007.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private ServerResponse exceptionHandler(Exception e) {
        if (e instanceof AreaException) {
            AreaException areaException = (AreaException) e;
            logger.error("[系统异常-自定义]{}",e);
            return ServerResponse.createByErrorCodeMessage(areaException.getCode(), areaException.getMessage());
        } else {
            logger.error("[系统异常-未知]{}",e);
            return ServerResponse.createByErrorCodeMessage(-1,e.getMessage());
        }
    }
}
