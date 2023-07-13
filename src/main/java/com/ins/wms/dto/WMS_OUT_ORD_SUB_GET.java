package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_OUT_ORD_SUB_GET {
    private String item_code;
    private int ord_qty;
    private String car_name;
    private String part_name;
    private String option01;   // 라벨유무
    private String option02;   // 재질
    private String option04;   // 칼라
}
