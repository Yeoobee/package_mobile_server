package com.ins.common.dto;

import lombok.Data;

@Data
public class Session {
    private String message;
    private String result;
    private int site_id;
    private String site_code;
    private String user_code;
    private String user_pwd;
}
