package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROD_CHECK_GET {
  private int site_id;
  private String plan_no;
  private String line_code;
  private String line_name;
  private String part_code;
  private String part_name;
  private int qty;
  private String unit_name;
  private String place_name;
  private String comments;

}
