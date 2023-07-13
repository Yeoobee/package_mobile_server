package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_OUT_BCR_NON_GET {
  private String cargo_code;
  private String part_code;
  private int qty;
  private String part_name;
  private String spec;
  private String unit_code;
  private String unit_name;

}
