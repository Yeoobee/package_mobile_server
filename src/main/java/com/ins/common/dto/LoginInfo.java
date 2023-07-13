package com.ins.common.dto;

import lombok.Data;

@Data
public class LoginInfo {
    private String message;
    private String result;
    private String user_code;
    private String user_type;
    private String user_name;
}
