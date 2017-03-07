package com.imyzone.main.dao;

import com.imyzone.main.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Titie:
 * Description:
 * JDK:
 * Tomcat:
 * Author: fangchenhui
 * CreateTime:2017/3/3 21:00
 * version: 1.0
 **/
@Repository
public interface UserDao {
    Integer confirmLog(UserEntity user);
}
