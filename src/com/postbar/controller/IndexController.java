package com.postbar.controller;

import com.postbar.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class IndexController {

    private UserAction userAction;

    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String loginResult(@RequestParam("username") String username,
                              @RequestParam("password") String password){
        String result = null;
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springConfig/applicationContext.xml");
        IndexController indexController = (IndexController) applicationContext.getBean("indexController");

        if(indexController.userAction.matchingPasswordByName(username,password)){
            result = "home";
        } else {
            result = "error";
        }
        return result;
    }

}
