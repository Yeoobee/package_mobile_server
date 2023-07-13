package com.ins.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class Page {
    private String user_code;
    private String work_date;
    private String supp_code;
    private String in_no;
    private String plan_date;
    private List<?> allList;
    private String allList2;
    private String plant_code;
    private String file_name;
    private Object sendObject;
    private int work_time;
    private int early_time;
    private int over_time;
    private int week_time;
    private int amount;
    private int qty;
}
