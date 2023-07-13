package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_IN_SUB {
  private String in_no;
  private String part_code;
  private int qty;
  private String bcr_yn;
  private String bcr_no;
  private String lot_no;
  private String part_name;
  private String spec;
  private String loc_name;
  private String unit_name;

}
