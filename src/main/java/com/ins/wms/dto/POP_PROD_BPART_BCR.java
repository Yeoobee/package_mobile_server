package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_BPART_BCR {
  private int site_id;
  private String plan_no;
  private String line_code;
  private String user_code;
  private String bcr_no;
  private String type_name;
  private String part_code;
  private String part_name;
  private String spec;
  private String lot_no;
  private String unit_name;
  private double qty;

  private String result;
  private String msg;
}
