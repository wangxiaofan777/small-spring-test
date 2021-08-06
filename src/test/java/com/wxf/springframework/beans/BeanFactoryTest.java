package com.wxf.springframework.beans;

import com.wxf.springframework.beans.factory.factory.BeanDefinition;
import com.wxf.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wxf.springframework.beans.service.UserService;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test() throws BaseException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.print();

    }
}
