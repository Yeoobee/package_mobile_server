package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_BCR_BEGIN_ADD {
  private String result;
  private String msg;
  private String bcr_no;
  private String car_name;
  private String my_name;
  private String item_code;
  private String part_name;
  private int     qty;
  private String spec;
}
