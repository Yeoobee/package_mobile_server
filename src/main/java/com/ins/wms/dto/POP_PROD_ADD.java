package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_ADD {
  private int site_id;
  private String plan_no;
  private String line_code;
  private String machine_code;
  private int qty;
  private String result;
  private String msg;
  private String user_code;


}
