package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROC_CHECK {
  private int site_id;
  private String line_code;
  private String plan_no;
  private String part_code;
  private String part_name;
  private String spec;
  private int prod_qty;
  private String unit_name;
  private String proc_status;
}
