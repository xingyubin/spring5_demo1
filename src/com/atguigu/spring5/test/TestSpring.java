package com.atguigu.spring5.test;

import com.atguigu.spring5.Dog;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xyb
 * @create 2022-01-25 15:00
 */
public class TestSpring {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user1 = context.getBean("user2",User.class);
        User user2 = context.getBean("user2",User.class);
        System.out.println(user1);
        System.out.println(user2);

    }

    @Test
    public void testDog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println("创建了实例对象");
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
        context1.close();
    }

    @Test
    public void testDog2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println("创建了实例对象");
        System.out.println(dog);

        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
        context1.close();
    }

}
