package com.wxf.springframework.beans.factory;

import com.wxf.springframework.beans.BaseException;

/**
 * beanFactory
 *
 * @author WangMaoSong
 * @since
 */
public interface BeanFactory {

    /**
     * 根据bean名称获取bean
     *
     * @param name bean名称
     * @return
     * @throws BaseException
     */
    Object getBean(String name) throws BaseException;
}
