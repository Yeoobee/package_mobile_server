package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_BOX_STOCK_GET {
    private String result;
    private String msg;
    private String box_no;
    private String car_name;
    private String my_name;
    private String item_code;
    private String part_name;
    private String option01;
    private String option02;
    private String option04;
    private int qty;
}
