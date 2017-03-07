package com.imyzone.main.service.impl;

import com.imyzone.main.dao.UserDao;
import com.imyzone.main.entity.UserEntity;
import com.imyzone.main.service.UserService;
import com.imyzone.util.ApplicationContextHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Titie:
 * Description:
 * JDK:
 * Tomcat:
 * Author: fangchenhui
 * CreateTime:2017/3/4 18:14
 * version: 1.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    //验证用户登录
    @Transactional
    public Integer confirmLog(UserEntity user) {
//        final UserDao userDao = (UserDao) ApplicationContextHelper.getBean("userDao");
        Integer flag=userDao.confirmLog(user);
        return flag;
    }
}
