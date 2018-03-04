package com.postbar.service;

import com.postbar.dao.UserDao;
import com.postbar.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserService {

    //注入userDao对象
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int register(User user){
        int result = userDao.add(user);
        return result;
    }

    @Test
    public void testRegister(){
        User user = new User();
//        user.setId(3);        //系统递增
        user.setName("Bob");
        user.setGender("boy");
        user.setAddress("NewYork");
        user.setPassword("123456");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.register(user));
    }

    public List<String> queryPasswordByName(String name){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        List<String> password = (List<String>) applicationContext.getBean("listByString");
        List<User> listUser = userDao.query(name);
        for (User user : listUser){
            password.add(user.getPassword());
        }
        return password;
    }

    @Test
    public void testQueryPasswordByName(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        List<String> list = null;
        list = userService.queryPasswordByName("Tom");
        System.out.println(list);
//        for (String s : list){
//            System.out.println(s);
//        }
    }

}
