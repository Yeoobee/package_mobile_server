package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_OUT_GET {
  private String work_date;
  private String cargo_code;
  private String cargo_name;
  private String type_code;
  private String type_name;
  private String part_code;
  private String part_name;
  private String spec;
  private String unit_name;
  private double qty;
  private int site_id;

}
