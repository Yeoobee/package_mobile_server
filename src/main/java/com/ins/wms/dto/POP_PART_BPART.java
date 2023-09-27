package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PART_BPART {
  private int site_id;
  private String part_code;
  private String part_name;
  private String spec;
  private String type_code;
  private String type_name;
  private String unit_name;
  private String lot_no;
  private String bcr_no;
  private String plan_no;
  private double qty;


}
