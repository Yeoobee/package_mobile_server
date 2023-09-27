package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_BPART_ADD {
  private int site_id;
  private String plan_no;
  private String line_code;
  private String cargo_code;
  private String lot_yn;
  private String part_code;
  private double qty;
  private String bcr_no;
  private String user_code;
  private String result;
  private String msg;

}
