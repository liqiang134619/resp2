package com.example.chatroom.dao;


import com.example.chatroom.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/5/9.
 */

@Component
public interface IUserMapper {
    /**
     * 查询数据中的user对象
     * @param username
     * @return
     */
    User findUser(String username);
}
