package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROD_APPROVAL {
  private int site_id;
  private String plan_no;
  private String qc_no;
  private String user_name;
  private String work_date;
  private String part_code;
  private String part_name;
  private String spec;
  private int qty;
  private String unit_name;
  private String result;
  private String msg;
  private String user_code;

}
