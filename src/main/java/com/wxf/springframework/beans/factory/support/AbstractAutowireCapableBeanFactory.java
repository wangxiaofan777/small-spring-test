package com.wxf.springframework.beans.factory.support;


import com.wxf.springframework.beans.BaseException;
import com.wxf.springframework.beans.factory.factory.BeanDefinition;

/**
 * 实例化bean类
 *
 * @author WangMaoSong
 * @since 2021-08-04 12:20:57
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BaseException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BaseException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, beanDefinition);
        return bean;
    }
}
