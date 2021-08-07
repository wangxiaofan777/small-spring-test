package com.wxf.springframework.beans;

import com.wxf.springframework.beans.factory.factory.BeanDefinition;
import com.wxf.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wxf.springframework.beans.service.UserService;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test() throws BeansException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.print();

    }

    /**
     * bean对象实例化测试
     */
    @Test
    public void testBeanInstantiation() throws BeansException {
        // 1. 初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        // 3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("UserService", "wxf");
        userService.print();

    }
}
