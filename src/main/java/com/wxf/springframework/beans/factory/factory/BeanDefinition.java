package com.wxf.springframework.beans.factory.factory;

/**
 * bean 定义对象
 *
 * @author WangMaoSong
 * @since 2021-08-04 12:18:11
 */
public class BeanDefinition {

    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }
}
