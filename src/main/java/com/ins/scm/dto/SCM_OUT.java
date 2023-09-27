package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_OUT {
  private String out_date;
  private String cargo_code;
  private String part_code;
  private String user_code;
  private double qty;
  private int site_id;
  private String result;
  private String msg;

}
