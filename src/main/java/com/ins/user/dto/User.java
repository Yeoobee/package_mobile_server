package com.ins.user.dto;


import lombok.Data;


import java.util.List;


@Data
public class User {
    private String user_code;
    private String user_pwd;
    private String user_name;
    private String result;
    private String site_code;
    private int site_id;
    private List<?> msg;

}
