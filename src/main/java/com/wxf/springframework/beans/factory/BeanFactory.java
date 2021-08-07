package com.wxf.springframework.beans.factory;

import com.wxf.springframework.beans.BeansException;

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
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;


    /**
     * 根据bean名称和参数获取bean对象
     *
     * @param name bean名称
     * @param args 参数
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;
}
