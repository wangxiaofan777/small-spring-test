package com.wxf.springframework.beans.factory.support;

import com.wxf.springframework.beans.BeansException;
import com.wxf.springframework.beans.factory.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口
 *
 * @author WangMaoSong
 * @since 2021-08-07 12:29:37
 */
public interface InstantiationStrategy {

    /**
     * 实例化对象
     *
     * @param beanDefinition Bean定义
     * @param beanName       bean名称
     * @param constructor    构造器
     * @param args           参数
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args) throws BeansException;
}
