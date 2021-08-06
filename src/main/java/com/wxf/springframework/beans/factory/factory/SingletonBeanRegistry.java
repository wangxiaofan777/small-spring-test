package com.wxf.springframework.beans.factory.factory;

/**
 * bean注册单例接口
 *
 * @author WangMaoSong
 * @since 2021-08-04 12:18:51
 */
public interface SingletonBeanRegistry {

    /**
     * 根据bean名称获取bean对象
     *
     * @param beanName bean名称
     * @return
     */
    Object getSingleton(String beanName);
}
