package com.coh.test;

import com.coh.pojo.User;
import com.coh.service.BirdService;
import com.coh.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testUserService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)applicationContext.getBean("userService");
        System.out.println(userService.getUser());

}
    @Test
    public void testUserService2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)applicationContext.getBean("userService2");
        System.out.println(userService.getStrings());

    }
    @Test
    public void testBirdService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BirdService birdService=(BirdService)applicationContext.getBean("birdService");
        System.out.println(birdService.getStrings());
        System.out.println(birdService.getMaps());


    }
    @Test
    public void testBirdService2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BirdService birdService=(BirdService)applicationContext.getBean("birdService");
        // TODO: 2023/3/30   构造注入没完成 

    }
}