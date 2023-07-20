package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_PROC_GET {
  private String proc_code;
  private String machine_code;
  private String part_code;
  private int qty;
  private String part_name;
  private String spec;
  private String unit_code;
  private String unit_name;
  private String part_type;
  private String part_type_name;


}
