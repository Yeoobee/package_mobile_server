package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_STOCK_SET_GET {
  private String cargo_code;
  private String bcr_no;
  private String user_code;
  private String result;
  private String msg;
  private int qty;
  private String part_code;
  private String part_name;
  private String spec;
  private String unit_code;
  private String unit_name;

}
