package com.ins.wms.dto;

import lombok.Data;

@Data
public class PROC_OUTS {
  private int site_id;
  private String plan_no;
  private String part_code;
  private String part_name;
  private String spec;
  private int prod_qty;
  private String unit_code;
  private String unit_name;
  private String supp_code;
  private String supp_name;
  private String line_code;
  private String line_name;
  private String user_code;
  private String result;
  private String msg;



}
