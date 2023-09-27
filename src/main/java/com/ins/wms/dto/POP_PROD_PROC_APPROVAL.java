package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_PROC_APPROVAL {
  private int  site_id;
  private String plan_no;
  private String line_code;
  private String part_code;
  private String part_name;
  private String spec;
  private String unit_name;
  private int qty;
  private String qc_no;
  private String work_date;
  private String user_name;
  private String user_code;
  private String result;
  private String msg;



}
