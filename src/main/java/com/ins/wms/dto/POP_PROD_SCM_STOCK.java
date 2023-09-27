package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_SCM_STOCK {
  private int site_id;
  private String type_code;
  private String cargo_code;
  private String part_code;
  private String part_name;
  private String spec;
  private String lot_no;
  private String lot_yn;
  private String bcr_no;
  private double qty;


}
