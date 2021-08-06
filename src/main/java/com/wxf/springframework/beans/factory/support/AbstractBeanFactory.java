package com.wxf.springframework.beans.factory.support;

import com.wxf.springframework.beans.BaseException;
import com.wxf.springframework.beans.factory.BeanFactory;
import com.wxf.springframework.beans.factory.factory.BeanDefinition;

/**
 * 抽象类模版方法
 *
 * @author WangMaoSong
 * @since 2021-08-04 12:21:40
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BaseException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 根据beanName 获取BeanDefinition
     *
     * @param beanName bean名称
     * @return
     * @throws BaseException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BaseException;

    /**
     * 创建bean对象
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BaseException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BaseException;
}
