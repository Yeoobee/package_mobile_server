package com.ins.user;

import java.util.List;

import com.ins.common.dto.Message;
import com.ins.mapper.user.UserMapper;
import com.ins.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Message login(User user) {
        return userMapper.login(user);
    }


}
