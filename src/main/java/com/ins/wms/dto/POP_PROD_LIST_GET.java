package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_LIST_GET {
  private int site_id;
  private String line_code;
  private String plan_no;
  private String status1;
  private String plan_date;
  private String type_name;
  private String part_code;
  private String part_name;
  private String spec;
  private String unit_name;
  private int plan_qty;
  private int qty;
  private String place_name;
  private String comments;




}
