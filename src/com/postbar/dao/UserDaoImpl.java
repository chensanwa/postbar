package com.postbar.dao;

import com.postbar.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

//@Transactional
public class UserDaoImpl implements UserDao {

    //得到HibernateTemplate对象
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int add(User user) {
        Integer integer = -1;
        try {
            Serializable result = hibernateTemplate.save(user);
            integer = (Integer) result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return integer;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> query(String username) {
        /*
        通过name属性进行查询数据
         */
        String hql = "from User where name=?";
        List<User> list = null;
        try{
            list = (List<User>) hibernateTemplate.find(hql,username);
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Test
    public void testQuery(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDaoImpl");
        List<User> list = userDao.query("Tom");
        for (User user : list){
            System.out.println(user.getName()+"  :  "+user.getPassword());
        }
    }

    @Test
    public void testAdd(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDaoImpl");

        User user = new User();
//        user.setId(3);        //系统递增
        user.setName("Bob");
        user.setGender("boy");
        user.setAddress("NewYork");
        user.setPassword("123456");
        userDao.add(user);


    }

}
