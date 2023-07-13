package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_OUT_SUB_GET {
  private String work_date;
  private String cargo_code;
  private String part_code;
  private int qty;
  private String bcr_yn;
  private String bcr_no;
  private String lot_no;
  private String part_name;
  private String spec;
  private String unit_code;
  private String unit_name;

}
