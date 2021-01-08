package com.hongyi;

import com.hongyi.user.entity.User;
import com.hongyi.user.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class TestDemo {
    @Autowired
    public IUserService userService;
    @Test
    public void test1(){
        User user = userService.getById(41);
        System.out.println(user);
    }

}
