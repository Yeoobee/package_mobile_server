package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_IN_ADD {
  private String result;
  private String msg;
  private String item_code;
  private String part_name;
  private String spec;
  private String unit_name;
  private String lot_no;
  private int qty;
  private String bcr_no;
}
