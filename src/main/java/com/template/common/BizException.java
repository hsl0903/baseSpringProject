package com.template.common;


import com.template.util.MessageUtil;
import lombok.Getter;


/**
 * 业务自定义异常
 *
 * @author Doug Liu
 * @since 2022-06-10
 */
@Getter
public class BizException extends RuntimeException {

    /**
     * 异常代码
     */
    private final Integer code;

    /**
     * 异常信息
     */
    private final String message;

    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;

    }

    public BizException(String message, Integer code) {
                super(message);
                        this.code = code;
                                this.message = message;
    }

    public BizException(Integer code) {
        this.code = code;
        this.message = MessageUtil.get(String.valueOf(code));
    }

    public BizException(String message, Throwable cause) {
           super(message, cause);   
    }

    public BizException(Throwable cause, Integer code) {
           super(cause);
    }

    public BizException(Throwable cause) {
        
           super(cause);
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
          super(message, cause, enableSuppression, writableStackTrace);
    }

    public BizException(String message) {
        super(message);
        this.code = 100001;
        this.message = message;
    }

    public BizException() {
           this.code = 100001;
            this.message = "未知错误";

    }


}