package com.postbar.action;

import com.postbar.entity.User;
import com.postbar.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserAction {
    private UserService userService;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public boolean matchingPasswordByName(String name,String password){
        boolean result = false;
        List<String> passwords = userService.queryPasswordByName(name);
        for (String p : passwords){
            if (p.equals(password)){
                result = true;
            }
        }
        return result;
    }

    public int registerUser(String name,String gender,String address,String password){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        user.setName(name);
        user.setGender(gender);
        user.setAddress(address);
        user.setPassword(password);
        int result = userService.register(user);
        return result;
    }

    @Test
    public void testRegisterUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        UserAction userAction = (UserAction) applicationContext.getBean("userAction");
        System.out.println(userAction.registerUser("Bob","boy","chengdu","123456"));
    }

    @Test
    public void testMatchingPasswordByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        UserAction userAction = (UserAction) applicationContext.getBean("userAction");
        System.out.println(userAction.matchingPasswordByName("Tom","1234569"));
    }
}
