package com.ins.common.dto;

import lombok.Data;

@Data
public class Message {
    private String message;
    private String result;
    private String user_code;
    private String user_name;
    private String site_code;
    private int site_id;
}
