package com.postbar.controller;

import com.postbar.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/doregister")
public class RegisterController {

    private UserAction userAction;

    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doRegister(HttpServletRequest request){
        String result = "error";
        String name = request.getParameter("username");
        String gender = request.getParameter("gender");
        String address = request.getParameter("password");
        String password = request.getParameter("password");
//        String picture = request.getParameter("picture");

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("springConfig/applicationContext.xml");
//        User user = (User) applicationContext.getBean("user");
        RegisterController registerController = (RegisterController) applicationContext.getBean("registerController");

//        user.setName(name);
//        user.setGender(gender);
//        user.setAddress(address);
//        user.setPassword(password);

        //图片功能后期开发

        int userId = registerController.userAction.registerUser(name,gender,address,password);
        if(userId == -1){
            result = "error";   //注册失败
        } else {
                //注册成功 userId为用户刚注册的ID
            result = "home";        //跳转至主页
        }
        return result;
    }

}
