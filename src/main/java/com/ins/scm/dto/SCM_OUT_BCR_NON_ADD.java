package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_OUT_BCR_NON_ADD {
  private String cargo_code_from;
  private String cargo_code_to;
  private String part_code;
  private int qty;
  private String work_date;
  private String user_code;
  private String result;
  private String msg;

}
