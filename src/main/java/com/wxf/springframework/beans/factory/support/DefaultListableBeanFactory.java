package com.wxf.springframework.beans.factory.support;


import com.wxf.springframework.beans.BeansException;
import com.wxf.springframework.beans.factory.factory.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 核心类
 *
 * @author WangMaoSong
 * @since 2021-08-04 12:23:58
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>(16);

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }
}
