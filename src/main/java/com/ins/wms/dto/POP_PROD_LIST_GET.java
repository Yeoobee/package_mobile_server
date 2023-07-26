package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_LIST_GET {
  private String plan_no;
  private String plan_date;
  private int plan_qty;
  private int qty;
  private String part_code;
  private String part_name;
  private String spec;
  private String unit_code;
  private String unit_name;
  private String part_type_name;
  private String status;
  private String proc_code;



}
