package com.wxf.springframework.beans;

/**
 * 自定义异常
 *
 * @author WangMaoSong
 * @date 2021/8/4
 */
public class BaseException extends Exception {

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
