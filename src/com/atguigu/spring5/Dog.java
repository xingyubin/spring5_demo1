package com.atguigu.spring5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.ReactiveAdapterRegistry;

/**
 * @author xyb
 * @create 2022-02-24 18:14
 */
public class Dog implements BeanPostProcessor {
    String myname;
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dog() {
        System.out.println("调用了无参数构造器");
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
        System.out.println("注入属性！");
    }

    public void initMethod(){
        System.out.println("初始化方法!");
    }

    public void destroyMethod(){
        System.out.println("销毁方法！");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行的方法");
        return bean;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "myname='" + myname + '\'' +
                ", user=" + user.toString()+
                '}';
    }
}
