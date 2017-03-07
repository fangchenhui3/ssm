package com.imyzone.main.controller;

import com.imyzone.main.entity.UserEntity;
import com.imyzone.main.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Titie:
 * Description:
 * JDK:
 * Tomcat:
 * Author: fangchenhui
 * CreateTime:2017/3/4 17:33
 * version: 1.0
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("login")
    public void login(HttpServletRequest request, HttpServletResponse response,UserEntity user) throws IOException {
        Integer flag=userService.confirmLog(user);
        if (flag == 1) {
            System.out.println(user.getEmail()+":"+"登录成功");
            HttpSession session=request.getSession();
            session.setAttribute("username",user.getEmail());
            response.sendRedirect("/jsp/main.jsp");
        }else{
            System.out.println("登录失败");
            response.sendRedirect("/jsp/login.jsp");
        }
    }

}
