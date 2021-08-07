package com.wxf.springframework.beans;

/**
 * 自定义异常
 *
 * @author WangMaoSong
 * @date 2021/8/4
 */
public class BeansException extends Exception {

    public BeansException() {
        super();
    }

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
