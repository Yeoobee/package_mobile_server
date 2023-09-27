package com.ins.user;

import java.util.List;

import com.ins.common.dto.Message;
import com.ins.common.dto.Session;
import com.ins.common.function.function;
import com.ins.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserRestController{


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)

    public Session login(HttpServletRequest req, @RequestBody Session dto) {
        HttpSession session=req.getSession(true);
        Session sessData=userService.login(dto);
        session.setAttribute("userData",sessData);
        session.setMaxInactiveInterval(60*60*24);

        return userService.login(dto);
    }

}
