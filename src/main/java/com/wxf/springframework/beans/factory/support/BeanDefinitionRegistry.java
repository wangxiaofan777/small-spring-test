package com.wxf.springframework.beans.factory.support;

import com.wxf.springframework.beans.factory.factory.BeanDefinition;

/**
 * @author WangMaoSong
 * @since 2021-08-04 12:23:01
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册bean
     *
     * @param beanName       Bean名称
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
