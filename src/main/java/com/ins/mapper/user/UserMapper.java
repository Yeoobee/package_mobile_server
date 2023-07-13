package com.ins.mapper.user;

import java.util.List;

import com.ins.common.dto.Message;
import com.ins.user.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    Message login(User user);


}