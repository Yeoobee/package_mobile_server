package com.ins.common.function;

import com.ins.common.dto.Session;

import javax.servlet.http.HttpServletRequest;

public class function {
    public Session getSessionData(HttpServletRequest req) {
        return (Session)req.getSession().getAttribute("userData");
    }
}
