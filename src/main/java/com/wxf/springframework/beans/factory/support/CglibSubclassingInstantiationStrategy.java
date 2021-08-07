package com.wxf.springframework.beans.factory.support;

import com.wxf.springframework.beans.BeansException;
import com.wxf.springframework.beans.factory.factory.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * Cglib实例化
 *
 * @author WangMaoSong
 * @since 2021/8/7
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (args == null) {
            enhancer.create();
        }
        return enhancer.create(constructor.getParameterTypes(), args);
    }
}
